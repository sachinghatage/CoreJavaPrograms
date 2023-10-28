package permutations;

public class FindPermutations {

    public static void main(String[] args) {
        permutation("ab");
    }

    public static void permutation(String word){
        permutation("", word);
    }

    public static void permutation(String perm,String word){
        if(word.isEmpty()){
            System.out.println(perm + word);
        }else{
            for(int i=0;i<word.length();i++){
                permutation(perm+word.charAt(i),word.substring(0,i)+word.substring(i+1,word.length()));
            }
        }
    }

}
