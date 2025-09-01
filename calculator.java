import java.util.Scanner;
public class calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre a first number: ");
        double a =sc.nextDouble();
        System.out.println("entre a Second number: ");
        double b =sc.nextDouble();
        System.out.println("entre your choice of cases: ");
        System.out.println("1.Add: ");
        System.out.println("2.sub: ");
        System.out.println("3.mult: ");
        System.out.println("4.div: ");


        int cal=sc.nextInt();
        switch(cal)

        {
            case 1:
            System.out.println("cal="+(a+b));
            break;
            case 2:
            System.out.println("cal="+(a-b));
            break;
            
            case 3:
            System.out.println("cal="+(a*b));
            break;
            
            case 4:
            if(b!=0)
                System.out.println("cal="+(a/b));
            else
                System.out.println("Not allowed");
                break;
            default:
            System.out.println("Ntg");
            

        }
    }
}