package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
Scanner scanner = new Scanner(in);
        System.out.println("= ");
        int n = scanner.nextInt();

    int res = 1;

    for (int i = 1; i <=10; i++) {


    res = n * i;

        System.out.println(n+" * "+i+" = " +res);

    }

    }
}
