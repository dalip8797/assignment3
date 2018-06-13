package primenumber2;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class Primenumber2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp;
        boolean is prime=true;
        Scanner scan =new Scanner(System.in);
        System.out.println("enetre the number");
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num\2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                is prime=false;
                break;
            }
        }
        if(isPrime)
            
           System.out.println(num+"is a prime number");
        else
            System.out.println(num+"is not prime number");
            }
        }
               

       
      
        // TODO code application logic here
    }
    
}
