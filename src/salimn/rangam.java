package salimn;

import java.util.Random;
import java.util.Scanner;

public class rangam {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random num= new Random();
        int totalatt=0,totalwin=0;
        double  totalavg;
        boolean playagain =true;

        while(playagain){
            int target = num.nextInt(100);
            int attemptes=0;
            int maxattpts=10;
            System.out.println("Welcome to the wonderful game...");
            while (attemptes < maxattpts) {
                System.out.println("Enter the no");
                int n = sc.nextInt();
                if (n == target) {
                    System.out.println("congrats you won for  target " + target + "  in" + attemptes +"attempts");
                    totalwin++;
                    break;

                } else if (n < target) {
                    System.out.println("no is low");

                } else {
                    System.out.println("no is high");
                }
                attemptes++;
            }

            if(attemptes==maxattpts){
                System.out.println("sorry max limit reached");
            }


            System.out.println("want to play again? (y/n):");
            playagain =sc.next().equals("y");
            totalatt+=attemptes;

        }

        totalavg=  totalatt/totalwin;
        System.out.println("\n game over wins"+totalwin+"in round total avg"+totalavg+" attempts per win");


    }
}
