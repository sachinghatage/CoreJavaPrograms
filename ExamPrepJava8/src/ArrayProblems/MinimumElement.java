package ArrayProblems;

public class MinimumElement {
    public static void main(String[] args) {
        int[] a={21,23,45,2,13,21,3,4,9};
        int minimum=Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            if (minimum>a[i]){
                minimum=a[i];
            }
        }
        System.out.println(minimum);
    }
}
