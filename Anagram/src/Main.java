public class Main {
    public static void main(String[] args) {
        //create string 1
        String s1="angel";
        //create string 2
        String s2="Angle";
        //converting string 1 and string 2 to lower case
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        boolean anagram = isAnagram(s1, s2);
        System.out.println(anagram);
    }

    private static boolean isAnagram(String s1, String s2) {
    if(s1.length()!=s2.length())
        return false;

    int count[]=new int[256];
    for(int i=0;i<s1.length();i++){
        count[s1.charAt(i)]++;
        count[s2.charAt(i)]--;
    }
    for (int i=0;i<256;i++){
        if(count[i]!=0){
            return false;
        }
    }
    return true;
    }
}
