package dowhileincreanddecre;

public class DoWhileIncre_Decre {
    public static void main(String[] args) {
        int x=0,y=10;
        do {
            --y;
            ++x;

        }while(x<5);

        System.out.println(x+"   "+y);
    }
}
