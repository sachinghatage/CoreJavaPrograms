package stringPrograms;

public class DuplicateString {
    public static void main(String[] args) {
        String s="Big black bug bit a big black dog on his big black nose";
       s= s.toLowerCase();
        String[] splits = s.split(" ");
        for (int i=0;i< splits.length;i++){
            int count=1;
            for (int j=i+1;j< splits.length;j++){
                if (splits[i].equals(splits[j])){
                    count++;
                }
                splits[j]="0";
            }
            if (count>1 && splits[i]!="0"){
                System.out.println(splits[i]);
            }
        }

    }
}
