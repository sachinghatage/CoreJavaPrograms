public class Main {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5};
        int i = secondHighest(a);
        System.out.println(i);


    }

    private static int secondHighest(int[] a) {
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int i:a){
            if(i>highest){
                secondHighest=highest;
                highest=i;
            } else if (i>secondHighest) {
                secondHighest=i;
            }
        }
        return secondHighest;
    }
}