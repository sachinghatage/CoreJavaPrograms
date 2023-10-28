package stringPrograms;

public class StringReverse {
    public static void main(String[] args) {
        String s="sachin";
        reverse(s);

    }

    public static void reverse(String s){
        //using for loop
//        for (int i=s.length()-1;i>=0;i--){
//            System.out.print(s.charAt(i));
//        }

        //using while loop
//       int i=s.length()-1;
//       while(i>=0){
//           System.out.print(s.charAt(i));
//           i--;
//        }

        //using swapping technique
        char[] chars = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(j>i){
            char temp=chars[j];
            chars[j]=chars[i];
            chars[i]=temp;
            j--;
            i++;


        }
        System.out.println(new String(chars)); //to convert the character array chars back into a string.


    }
}
