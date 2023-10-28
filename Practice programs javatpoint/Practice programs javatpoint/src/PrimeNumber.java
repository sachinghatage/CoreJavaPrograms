public class PrimeNumber {
    public static void main(String[] args) {
        int n=4;
        System.out.println(prime(n));
    }

    public static boolean prime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
            if(count>2){
                return false;
            }
        }
        return true;
    }
}
