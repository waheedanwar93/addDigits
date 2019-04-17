import java.awt.*;
import  java.util.Scanner;
import java.lang.Math;
public class java {
    public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        long a=input.nextInt();
        System.out.println();
        int count=0;
      long  b=a;
        long sum=0;

        for(;b!=0;){
             b=b/10;
            count++;
        }
        long c=a;
        for(int i=0;i<count;i++){
            sum=sum+c%10;
            c=c/10;

        }
        System.out.println("The sum of numbers is="+sum);

    }
}