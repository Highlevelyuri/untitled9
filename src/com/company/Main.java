package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int number = 0;

      number = scanner.nextInt();
      if(number%3 == 0)
          System.out.println(number + "число делиться нацело на три");
      else
          System.out.println(number + " число не делиться нацелло на три");

    }
}
