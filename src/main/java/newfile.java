import java.util.Scanner;

public class newfile {
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 2;
        int b = 3;
        System.out.println(a+b);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Username");

        String userName = myObj.nextLine();
        System.out.println("Username is :" +userName);


    }
}
