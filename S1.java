import java.util.Scanner;
public class S1 {
    public static void main(String[] args){
        int a,b,c,d,e,f,g;
        System.out.println("Enter the value for A :");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter the value for B :");
        b=sc.nextInt();
        c=a+b;
        System.out.println("\nA= "+a+"\nb= "+b+ "\nAddition is "+c);
        d=a-b;
        System.out.println("\nsubstraction is "+d);
        e=a*b;
        System.out.println("\nMultiplication is "+e);
        f=a/b;
        System.out.println("\nDivision is "+f);
        g=a%b;
        System.out.println("\nDivision is "+g);
        System.out.println("enter another number for comparison");
        int h=sc.nextInt();
        if (a>b && a>h){
            System.out.println(a+"is greater than"+b+"and "+h);
        }
        else if(b>a && b>h){
            System.out.println(b+"is greater than"+a+"and "+h);
        }
        else{
            System.out.println(h+"is greater than"+a+"and "+b);
        }



    }
}
