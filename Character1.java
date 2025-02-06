import java.util.Scanner;
public class Character1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char alpha;
        System.out.println("Enter an alphabet");
        alpha=sc.nextLine().charAt(0);
        System.out.println(alpha);

        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u'){
            System.out.println("Vowels");
        }
        else{
            System.out.println("Not a Vowel");
        }
    }
    
}
