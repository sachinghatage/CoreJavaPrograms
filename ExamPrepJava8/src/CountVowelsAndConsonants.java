public class CountVowelsAndConsonants {
     static  int vcount=0,ccount=0;
    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz";
        countVC(s);
    }

    private static void countVC(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vcount++;

            } //else if (s.charAt(i)>='a'||s.charAt(i)<='z') {
//                ccount++;
//            }
                else{
                    ccount++;
                }

        }
        System.out.println("vowels count :" +vcount);
        System.out.println("consonants count :" +ccount);
    }
}
