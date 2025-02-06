import java.util.Scanner;
public class EligibilityforVOTE {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name :");
        String name=sc.nextLine();
        System.out.println("Enter Your Age :");
        int age=sc.nextInt();


        System.out.println("Checking For Eligibility of Voting");
        if (age>=18){
            System.out.println(name+" You are Eligible for Vote");
        }
        else{
            System.out.println(name+" You are not eligible for vote");
        }
        sc.close();
    }
    
}
