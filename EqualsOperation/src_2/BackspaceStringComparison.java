public class BackspaceStringComparison {
    public static void main(String[] args) {
        String s1 = "ab#d";
        String s2 = "ac#d";

        boolean isEqual = compareStrings(s1, s2);

        System.out.println("Are the strings equal? " + isEqual);
    }

    public static boolean compareStrings(String s1, String s2) {
        int pointer1 = s1.length() - 1;     //3
        int pointer2 = s2.length() - 1;     //3
        int backspace1 = 0;
        int backspace2 = 0;

        while (pointer1 >= 0 || pointer2 >= 0) {
            while (pointer1 >= 0 && (s1.charAt(pointer1) == '#' || backspace1 > 0)) {
                if (s1.charAt(pointer1) == '#') {
                    backspace1++;
                } else {
                    backspace1--;
                }
                pointer1--;
            }

            while (pointer2 >= 0 && (s2.charAt(pointer2) == '#' || backspace2 > 0)) {
                if (s2.charAt(pointer2) == '#') {
                    backspace2++;
                } else {
                    backspace2--;
                }
                pointer2--;
            }

            if (pointer1 >= 0 && pointer2 >= 0 && s1.charAt(pointer1) != s2.charAt(pointer2)) {
                return false;
            }

            if ((pointer1 >= 0) != (pointer2 >= 0)) {
                return false;
            }

            pointer1--;
            pointer2--;
        }

        return true;
    }
}