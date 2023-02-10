public class recursion1 {
   public static void printNumb(int n) {

//     if(n==0){
//         return;
//     }
//     System.out.println(n);
//     printNumb(n-1);
//    } 
//    public static void main(String [] args) {
//     int n=5;
//     printNumb(n);
//    }
// public static void main(String[] args) {
//     int n=5;
//     for (int i = 5; i >=1; i--) {
//      System.out.println(i);   
//     }
if(n==6){
    return;
}
System.out.println(n);
printNumb(n+1);

}
public static void main(String[] args) {
    

int n=1;
printNumb(n);
}
}


