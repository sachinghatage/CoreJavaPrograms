package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//        Scanner scanner=new Scanner(System.in);
//        int n = scanner.nextInt();
//        for(int i=0;i<n;i++){
//            int num = scanner.nextInt();
//            list.add(num);
//        }
//
//        List<Integer> even=new ArrayList<>();
//        List<Integer> odd=new ArrayList<>();
//        for(int number:list){
//            if (number%2==0){
//                even.add(number);
//            }else{
//                odd.add(number);
//            }
//        }
//
//        System.out.println("even numbers "+ even);
//        System.out.println("odd numbers "+ odd);
        int[] numbers={1,2,3,4,5,6,7,8,9};

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];

        evenCount = 0;
        oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenCount] = number;
                evenCount++;
            } else {
                oddNumbers[oddCount] = number;
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
        System.out.println("odd numbers: " + Arrays.toString(oddNumbers));



    }
}
