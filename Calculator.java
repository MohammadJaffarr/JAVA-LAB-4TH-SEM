import java.util.Scanner;

class MathHelper {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option,a,b;

        MathHelper mh = new MathHelper();
        System.out.println("Enter 1 for Add :");
        System.out.println("Enter 2 for Sub :");
        System.out.println("Enter 3 for Mul :");
        System.out.println("Enter 4 for Div :");
        option = sc.nextInt();
        System.out.println("Enter the 1st value : ");
        a = sc.nextInt();
        System.out.println("Enter the 2nd value : ");
        b=sc.nextInt();
        int result =0;

        if (option == 1 ) {
            result = mh.add(a, b);
        }else if (option == 2) {
            result = mh.sub(a, b);
        }else if (option == 3) {
            result = mh.mul(a, b);
        }else if (option == 4) {
            result = mh.div(a, b);
        }else{
            System.out.println("Chose the correct option ");
        }
        System.out.println("Result is : "+ result);


        sc.close();

    }
}
