import java.util.*;
public class average {
public static void main(String [] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number= ");
    int num1= sc.nextInt();
    System.out.println("enter the second number= ");
    int num2= sc.nextInt();
    System.out.println("enter the third number= ");
    int num3= sc.nextInt();
    System.out.println("the average of number="+average(num1,num2,num3/3));
}
public static double average(int num1, int num2,int num3) {
    return (double)(num1+num2+num3)/3;

}
}
