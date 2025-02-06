import java.util.Scanner;

public class Assignment1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();

        System.out.println("Enter Which operation You want to perform");
        System.out.println("\n1.Positive Number or Negative Number \n2.Even Or Odd Number ");

        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            if (a>0){
                System.out.println(a+" is positive Number ");
            }
            else{
                System.out.println(a+" is Negative Number ");
            }
            break;
            case 2:
            if (a%2==0){
                System.out.println(a+" is Even Number ");

            }
            else{
                System.out.println(a+" is odd Number");
            }
        
            default:
                break;
        }
        sc.close();

    }
}
