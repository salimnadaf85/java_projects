package salimn;

import java.util.Scanner;

public class secondpro {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of subjects:");
        int f = sc.nextInt();
        for (int i = 1; i <= f; i++) {
            System.out.println("Enter the subject  "+i);
            String s = sc.next();

            a += total();
        }
        double perc = (double) a/f ;

        System.out.println("Results of the student");
        System.out.println("Total marks:" + a);
        System.out.println("Avg percentage:"+perc+"%");
        char grade = grade(perc);
        System.out.println("Grade obtained: " + grade);

    }
    public static char grade(double perc){
        if (perc>=90) {
            return 'A';
        }
        else if (perc>=80){
            return 'B';}

        else  if (perc>=70) {
            return 'C';
        }
        else if (perc>=60){
            return 'D';

        }
        else {
            return 'F';
        }

    }
    static  int total(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of  the subject (out of 100) :");
        int n=sc.nextInt();
        return  n;

    }

}
