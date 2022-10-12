package practice1;

public class Lab1 {
    public static void main(String[] args){

        int t=0;
        int p=10;
        double y;
        int[] mass=new int[p];
        for(int i=1;i<=p;i++){
            mass[i-1]=i;
            t+=1;
        }
        y=(double)t/p;
        System.out.println(y);
    }
}
