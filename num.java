import java.util.Scanner;
public class num {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.print(" Enter num1 ");
        int num1 = sc.nextInt();
        System.out.print(" Enter num2 ");
        int num2 = sc.nextInt();
        System.out.print(" Enter num3 ");
        int num3 = sc.nextInt();
        System.out.print(" Enter num4 ");
        int num4 = sc.nextInt();
        System.out.print(" Enter num5 ");
        int num5 = sc.nextInt();
        int sum = (num1 + num2 + num3 + num4 + num5) ;
        System.out.println("sum : "+sum);
        System.out.println("avg : "  +sum/5);
    }
}