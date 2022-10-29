package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Sırasıyla ucgenin dik kenarlarini giriniz: ");
        a = input.nextDouble();
        b = input.nextDouble();

        double c = Math.sqrt((Math.pow(a,2))+Math.pow(b,2));

        System.out.println("Ucgenin ucuncu kenari : " +c);

        double cevre = a+b+c;
        System.out.println("Ucgenin cevresi: "+cevre);
    }
}
