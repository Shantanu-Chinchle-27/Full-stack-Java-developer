import java.util.Scanner;
public class UsingSwitch {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Enter a number which opearation you want to Perform from Following ");
        System.out.println("\n1.Addition, \n2.Substraction \n3.Division \n4.Multiplication \n 5.Modulus");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                int add=a+b;
                System.out.println("Addition "+add);
                break;
            
            case 2:
                int sub=a-b;
                System.out.println("Subtraction "+sub);
                break;
            
            case 3:
                int div=a/b;
                System.out.println("Division "+div);
                break;
            
            case 4:
                int mul=a*b;
                System.out.println("Multiplication "+mul);
                break;

            case 5:
                int mod=a%b;
                System.out.println("Modulus "+mod);
                break;
        
            default:
                System.out.println("Enter valid Choice");
                break;
        }
    }
}
