package practice1;

import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int i=0;
        int max=0;int min = 0;
        int y=sc.nextInt();
        int[] mass=new int[y];
        while(i<y){
            mass[i]=sc.nextInt();
            if(i==0){
                max=mass[i];
                min=mass[i];
            }
            if(max<mass[i])
                max=mass[i];

            if(min>mass[i])
                min=mass[i];
            n+=mass[i];
            i++;
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(n);

    }
}
