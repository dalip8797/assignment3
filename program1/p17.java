package re
        {
import java.util.Scanner;



/**
 *
 * @author User
 */
public class Re {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Number,Reminder,Reverse=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("please enter the number you want to reverse:");
        Number = sc.nextInt();
        while(Number >0)
        {
            Reminder = Number%10;
            Reverse =Reverse *10+Reminder;
            Number = Number/10;
        }
        System.out.println("the reverse number is:"+Reverse);
    }
        // TODO code application logic here
    }
    
}
