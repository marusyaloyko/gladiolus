package practice2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите cлова");
        String n = sc.nextLine();
        int c=0;

        if(n.length()!=0){
            c++;
            for(int i =0;i<n.length();i++){
                if(n.charAt(i)==' '){
                    c++;
                }
            }
        }
        System.out.println("Вы ввели "+c+"слов");
     }

}
