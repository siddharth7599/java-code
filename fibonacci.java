import java.util.*;
public class fibonacci {
    public static void printFib(int a, int b, int n ){
        if(n == 0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFib(b, c, n-1);

    }
    public static void main(String [] args) {
Scanner sc=new Scanner(System.in);

        int a=0, b=1;
        System.out.println(a);

        System.out.println(b);
        int n=sc.nextInt();
        printFib(a, b, n-2);


    }

}
