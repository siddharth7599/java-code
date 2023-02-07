import java.util.Scanner;

// Write a function which takes in 2 numbers and returns the greater of those two.

public class greater {
  public static void main(String [] args) {
    Scanner  sc=new Scanner(System.in);
    int n =sc.nextInt();
    int m =sc.nextInt();
if (n<=m){
    System.out.println("smaller number ="+n);
}else{
    System.out.println("greater number ="+m);
}

  }
}
