package ArrayProblems;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int firstLarge=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        int thirdLarge=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if (a[i]>firstLarge){
                thirdLarge=secondLarge;
                secondLarge=firstLarge;
                firstLarge=a[i];
            } else if (a[i]>secondLarge && a[i]<firstLarge) {
                thirdLarge=secondLarge;
                secondLarge=a[i];
            } else if (a[i]>thirdLarge && a[i]<secondLarge) {
                thirdLarge=a[i];
            }
        }
        System.out.println(thirdLarge);
    }
}
