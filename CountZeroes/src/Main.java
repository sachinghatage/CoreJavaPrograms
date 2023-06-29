public class Main {
    public static void main(String[] args) {

        Integer a=2030000100;
        String s = a.toString();
        int count = count(s);
        System.out.println(count);


    }

    private static int count(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count++;
            }
        }
        return count;

    }
}