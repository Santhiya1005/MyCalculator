package calculator;
import java.util.Scanner;
public class Calculator{
    static double add(double a,double b)
    {
        return a+b;
    }
    static double sub(double a,double b)
    {
        return a-b;
    }
    static double multi(double a,double b)
    {
        return a*b;
    }
    static double division(double a,double b)
    {
        if(b==0)
        {
            System.out.println("can't divide");
            return 0;
        }else return a/b;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter first num: ");
        double first_num=sc.nextDouble();
        System.out.println("Enter second num: ");
        double second_num=sc.nextDouble();
        System.out.println("Enter options 1.add 2.sub 3.multiplication 4.division");
        int operation=sc.nextInt();
        double result = switch(operation){
            case 1 -> add(first_num,second_num);
            case 2 -> sub(first_num,second_num);
            case 3 -> multi(first_num,second_num);
            case 4 -> division(first_num,second_num);
            default -> 0;
        };
        System.out.println("result: "+ result);
        System.out.println("Do u want to exit?yes/no ");
        String exit=sc.next();
        if(exit.equalsIgnoreCase("yes"))
        {
            break;
        }
        }
    }
}