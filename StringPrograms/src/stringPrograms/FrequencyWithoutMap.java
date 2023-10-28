package stringPrograms;

public class FrequencyWithoutMap {
    public static void main(String[] args) {
        String s = "habibi";
        int[] frequency = frequency(s);
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i]>0) {    //if we dont give this condition it will print all 256 characters
                                     // with zero frequency also
                System.out.println(((char) i + " " + frequency[i]));
            }
        }

        }

    private static int[] frequency(String s) {
        int[] f=new int[256];
        for (char c:s.toCharArray()){
            f[c]++;
        }
        return f;
    }

}
