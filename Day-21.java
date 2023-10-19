
//write a program for to check if two String is a rotation of each other in javapublic class StringRotation 
public class StringRotation {
    public static boolean areRotations(String str1, String str2) {
        // Check if the lengths of both strings are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself and check if str2 is a substring
        String concatenatedStr = str1 + str1;
        return concatenatedStr.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        if (areRotations(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
        }
    }
}
