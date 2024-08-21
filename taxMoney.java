import java.util.Scanner;
public class taxMoney {

    public static void main (String [] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary : ");
        short salary = sc.nextShort();
        int tax = (10*salary)/100 ;
        
        System.out.println("tax money : " + tax  );
    }
}