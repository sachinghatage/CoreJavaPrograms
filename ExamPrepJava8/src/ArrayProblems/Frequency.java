package ArrayProblems;

public class Frequency {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5,1,2,3,5};
        int[] f=new int[a1.length];
        int visited=-1;
        for (int i=0;i<a1.length;i++){
            int count=1;
            for (int j=i+1;j<a1.length;j++){
                if (a1[i]==a1[j]) {
                    count++;

                    f[j] = visited;
                }
            }
            if (f[i]!=visited){
                f[i]=count;
            }
        }

        for (int i=0;i<f.length;i++){
            if(f[i]!=visited)
                System.out.println(a1[i]+" | "+f[i]);
        }

    }
}
