package dev.ruster.td1;

import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        fibonacci();
    }

    public static void first_one() {
        int nb, x, v;

        nb = 10;
        v = 8;
        x = v - nb;
        v *= 5;
        x = v - nb;
        x -= nb;

        System.out.println("nb » " + nb);
        System.out.println("x » " + x);
        System.out.println("v » " + v);
    }

    public static void swap() {
        int a = 10, b = 3;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a » " + a);
        System.out.println("b » " + b);
    }

    public static void next_ten() {
        System.out.print("Choisissez un entier : ");
        int n = scan.nextInt();

        for(int i = n; i < n + 10; i++) {
            System.out.println("» " + (i + 1));
        }
    }

    public static void sum_1() {
        System.out.print("Choisissez un entier : ");
        int n = scan.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Choisissez la valeur du " + (i + 1) + "° entier : ");
            sum += scan.nextInt();
        }
        System.out.println("La somme est de " + sum);
    }

    public static void sum_2() {
        int n = 0, sum = 0, x;

        do {
            System.out.print("Choisissez un entier : ");
            x = scan.nextInt();

            if(x != 0) {
                sum += x;
                n++;
            }
        } while(x != 0);

        System.out.println("Vous avez saisi " + n + " entiers et leur somme est de " + sum);
    }

    public static void age_average() {
        int sum = 0;
        int count;

        do {
            System.out.print("Combien y a t-il de personnes ? ");
            count = scan.nextInt();
        } while(count <= 0);

        for(int i = 0; i < count; i++) {
            int x;

            do {
                System.out.print("Quel âge a la " + (i + 1) + "° personne ? ");
                x = scan.nextInt();
            } while(x <= 0);

            sum += x;
        }
        System.out.println("La moyenne d'âge est de " + (sum / count));
    }

    public static void suite() {
        int n, u_n = 0;

        do {
            System.out.print("Choisissez un entier : ");
            n = scan.nextInt();
        } while(n < 0);

        for(int i = 0; i < n; i++) {
            u_n += i + 1;
            System.out.println("n » " + (i + 1) + " | U(n) » " + u_n);
        }
    }

    public static void fibonacci() {
        int n, u_n = 0, u_1 = 0, u_2 = 1;

        do {
            System.out.print("Choisissez un entier : ");
            n = scan.nextInt();
        } while(n < 0);

        System.out.println("n » 1 | U(n) » " + u_1);
        System.out.println("n » 2 | U(n) » " + u_2);

        for(int i = 2; i < n; i++) {
            u_n += u_1 + u_2;
            u_1 = u_2;
            u_2 = u_n;
            System.out.println("n » " + (i + 1) + " | U(n) » " + u_n);
        }
    }

    public static void euclidean_division() {
        int count = 0, n, p;

        do {
            System.out.print("Choisissez un entier n : ");
            n = scan.nextInt();
        } while(n < 0);

        do {
            System.out.print("Choisissez un entier p : ");
            p = scan.nextInt();
        } while(p < 0);

        while(n >= p) {
            n -= p;
            count++;
        }
        System.out.println("Quotient » " + count + "\nReste » " + n);
    }

    public static void for_and_do_while() {
        System.out.print("Combien de fois voulez vous boucler ? ");
        int n = scan.nextInt();
        int i = 0;

        while(i < n) {
            System.out.println((i + 1) + "° time");
            i++;
        }
    }

    public static void streak_limit() {
        System.out.print("Choisissez un entier : ");
        int n = scan.nextInt(), count = 0;
        double z = 1, sum = 0;
        boolean even = true;

        while(count < n) {
            sum = (even ? sum + 1 / z : sum - 1 / z);
            System.out.println((count + 1) + " » " + 1 + "/" + z);

            z += 2;
            even = !even;
            count++;
        }
        System.out.println("Somme de la série jusqu'à " + (count + 1) + " itérations » " + sum);
    }
}