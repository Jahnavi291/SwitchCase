import java.util.Scanner;
public class quadraticEqu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Entre value of a : ");
        double a=sc.nextDouble();
        System.out.println(" Entre value of b : ");
        double b=sc.nextDouble();
        System.out.println(" Entre value of c : ");
        double c=sc.nextDouble();
        double D=b*b-(4*a*c);
        switch((D>0)?1:(D==0?0:-1))
        {
            case 1:
             double root1=(-b + Math.sqrt(D))/(2*a);
             double root2=(-b - Math.sqrt(D))/(2*a);
            System.out.println("roots are real and distinct"+root1+" ,"+root2);
            break;
            case 0:
             double root=-b/(2*a);
             System.out.println("roots are real and equal"+root);
             break;
             case -1:
             System.out.println("roots are imaginary");
             break;
             default:
             System.out.println("ntg");
        }
    }
}