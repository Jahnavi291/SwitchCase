import java.util.Scanner;
public class maximum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number :");
        int a=sc.nextInt();
        System.out.println("enetre second number :");
        int b=sc.nextInt();
        int Max=(a>b)?1:(a<b)?2:0;
        switch(Max)
        {
            case 1 :
                System.out.println(a+"is a greater");
                break;
            case 2:
                System.out.println(b+"is a graeter");
                break;
            default:
                System.out.println("Ntg");    
        }
    }
}