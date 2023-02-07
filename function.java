import java.util.*;

 public class function{
    // public static  int calculatorSum(int a, int b){
    // int sum = a + b;
    // return sum;
//  public static int calculateProdct(int a, int b){
//     return a*b;

public static void printFactorial(int n) { 
    int factorial=1;

    if(n<0){
System.out.println("invalid number");
return;
    }
    for (int i = n; i >=1; i--) {
        factorial=factorial*i;
    }
    System.out.println(factorial);
    return;
}



    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    printFactorial(n);
        

        // int sum = calculateProdct(a, b);
        // System.out.println("enter 2 number="+calculateProdct(a, b));
    }
 }