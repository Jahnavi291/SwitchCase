import java.util.Scanner;
public class VowelOrConsonant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter an Alphabet:");
        char ch=sc.next().toLowerCase().charAt(0);
        switch(ch)
        {
            case 'a': case 'e' : case 'i': case 'o' : case 'u':
            {

            
                System.out.println(" it is an Vowel");

                break;
            }
            default:
            {

            
                System.out.println("it is a Consonant");
            }
        }
    }

}
