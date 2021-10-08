import java.util.Scanner;

public class demo {
    public static void main (String args[])
    {
        int a,b,c,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        a=sc.nextInt();
        System.out.println("Enter B:");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Enter Choice ");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Multi");
        System.out.println("4.Division");
        System.out.println("5.Modulo");
        ch= sc.nextInt();

        switch (ch)
        {
            case 1 :
                c=a+b;
                System.out.println("A+b:" + c);
                break;
            case 2 :
                c=a-b;
                System.out.println("A-b:" + c);
                break;
            case 3 :
                c=a*b;
                System.out.println("A*b:" + c);
                break;
            case 4 :
                c=a/b;
                System.out.println("A/b:" + c);
                break;
            case 5 :
                c=a%b;
                System.out.println("A%b:" + c);
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
