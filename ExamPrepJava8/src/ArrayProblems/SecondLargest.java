package ArrayProblems;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int firstLarge=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if (a[i]>firstLarge) {
                secondLarge = firstLarge;
                firstLarge=a[i];
            } else if (a[i]>secondLarge && a[i]<firstLarge) {
                secondLarge=a[i];
            }
        }
        System.out.println(secondLarge);
    }
}
