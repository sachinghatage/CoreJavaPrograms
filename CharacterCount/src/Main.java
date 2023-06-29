public class Main {
    public static void main(String[] args) {

        String s="Hello World";
        char target='o';
        int count=0;

        for(char c:s.toCharArray()){
            if(c==target)
                count++;
        }
        System.out.println(target+" "+count);
    }
}