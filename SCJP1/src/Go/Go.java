package Go;

public class Go {
    public static void main(String[] args) {
        Go go=new Go();
        go.go();
    }

    private void go() {
        String o="",z;
        for(int x=0;x<3;x++){
            for(int y=0;y<2;y++){
                if (x==1)
                    break;

                if (x==2&&y==1)
                    break ;
                    o=o+x+y;
            }
        }
        System.out.println(o);
    }
}
