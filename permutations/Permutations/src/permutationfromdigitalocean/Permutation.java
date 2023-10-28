package permutationfromdigitalocean;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

    public static Set<String> permutationFinder(String s){
        Set<String> perm=new HashSet<String>();
        if(s==null){
            return null;
        } else if (s.length()==0) {
            perm.add("");
            return perm;
        }
        char initial=s.charAt(0);
        String rem=s.substring(1);
        Set<String> words=permutationFinder(rem);
        for(String sNew : words){
            for(int i=0;i<=sNew.length();i++){
                perm.add(charInsert(sNew,initial,i));
            }
        }
        return perm;
    }

    public static String charInsert(String s,char c,int j){
        String begin=s.substring(0,j);
        String end=s.substring(j);
        return begin+c+end;
    }


    public static void main(String[] args) {
        String s="AAC";
        String s1="ABC";
        String s2="ABCD";
        System.out.println("s  "+permutationFinder(s));
        System.out.println("s1  "+permutationFinder(s1));
        System.out.println("s2  "+permutationFinder(s2));
    }
}
