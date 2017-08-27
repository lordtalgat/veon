package kz.veon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main=new Main();Scanner sc = new Scanner(System.in);
        long a = 1L;
        long b= 1L;
        System.out.print("Enter first Long data: ");
        if(sc.hasNextLong()) {
            a = sc.nextLong();
            System.out.print("Enter second Long data: ");
            if (sc.hasNextLong()){
                b = sc.nextLong();
                System.out.format("Summ of 2 Longs=%d",main.substract(a,b));
            }else{
                System.out.println("Second not Long data type");
            }
        } else {
            System.out.println("First not Long data type");
        }
    }

    public long substract(long a, long b){
        return a+b;
    }
}
