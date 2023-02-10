import java.util.Scanner;

public class Strings{
    public static void main(String[] args) {
        //String Declaration
        // String name ="siddharth";
        // String fullName ="siddharth verma";
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println("enter your name="+name);
        //concatination
        // String firstname ="siddharth";
        // String lastname = "verma";
        // String fullname = firstname +"@"+ lastname;
        // System.out.println(fullname.length());

        //charAt
        // for (int i = 0; i < fullname.length(); i++) {
        //     System.out.println(fullname.charAt(i));
        // }
        // String name1= "sid";
        // String name2 ="sid";
        // if (name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        String sentence = "my name is sid";
        // substring (beg index, end index)
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);

    }
}