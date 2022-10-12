package practice1;

public class Lab1_5 {
    public static int factorial(int w){
        int a = 1;
        for (int i = 1; i <=w; i ++){
            a = a*i;
        }
        return a;
    }
    public static void main(String[] args){
        System.out.println(factorial(12));
}
}
