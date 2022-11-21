import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int a,b,c,k;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
        System.out.println("enter 1-Addition 2-Subtraction 3-Multiplication 4-Division : ");
        c=sc.nextInt();
        switch (c) {
            case 1:
                k = a + b;
                System.out.println("Sum is " + k);
                break;
        }

    }
}
