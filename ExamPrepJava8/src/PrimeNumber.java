public class PrimeNumber {
    public static void main(String[] args) {
        int n=8,count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if(count==2)
            System.out.println("prime number");
        else {
            System.out.println("not a prime number");
        }
    }
}
