public class Main implements Cloneable{
    private int id;
    private String name;

    Main(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) throws CloneNotSupportedException{

           Main main1=new Main(1,"john");

           Main main2 = (Main) main1.clone();

           System.out.println(main1.name);
           System.out.println(main2.name);


    }
}