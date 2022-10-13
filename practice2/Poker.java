package practice2;

import java.util.Scanner;

public class Poker {


    public static void main(String[] args) {

        int cards = 5;
        int players = 0;

        String[] s = {"Diamonds", "Hearts", "Clubs", "Spades"
        };

        String[] r = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K", "A"
        };

        int n = s.length * r.length;

        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");

            if (sc.hasNextInt()) {

                players = sc.nextInt();
                if (cards * players <= n) {
                    break;
                } else {
                    if (players == 0) {

                        System.out.println("Конец");
                        break;

                    } else if (players < 0) {

                        System.out.println("Число слишком маленькое");

                    } else {

                        System.out.println("Ваше число слишком большое");
                    }
                }

            } else {
                System.out.println("Вы ввели не число, или Ваше число слишком большое!");
            }
            String[] deck = new String[n];
            for (int i = 0; i < r.length; i++) {
                for (int j = 0; j < s.length; j++) {
                    deck[s.length * i + j] = r[i] + " " + s[j];


                    for (; i < n; i++) {
                        int t = i + (int) (Math.random() * (n - i));
                        String temp = deck[t];
                        deck[t] = deck[i];
                        deck[i] = temp;
                    }

                    for (; i < players * cards; i++) {
                        System.out.println(deck[i]);
                        if (i % cards == cards - 1) ;
                    }
                }
            }
        }
    }
}








