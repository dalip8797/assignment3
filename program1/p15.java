package evennumber;
import java.util.Scanner;

/**
 *
 * @author User
 */
 class Evennumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of even number:");
        int limit = sc.nextInt();
        System.out.println("even number from 1 to "+limit+":");
        for(int x=1;x<=limit;x++)
        {
            if(x%2==0)
                
            {
                System.out.println("even number is:"+x);
            }
                
                    
                      
                    
        }
        
                
            
            
        // TODO code application logic here
    }
    
}

