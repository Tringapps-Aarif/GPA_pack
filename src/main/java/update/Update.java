package update;

import calculation.Calculation;
import java.util.Scanner;
import java.util.logging.Logger;

public class Update {
            final Logger print = Logger.getLogger("Gpa");
            Scanner sc=new Scanner(System.in);


   public void updating()
   {

        print.info("Do you need to update your grade YES=1   NO=0");
       int ch=sc.nextInt();
        if(ch==1)
        {

        System.out.print("Enter your new grade: ");
        String newgrade=sc.next();
        Calculation cal=new Calculation(newgrade);
        print.info(cal.calculating(newgrade));
        }
        else{
        System.exit(0);
        }
        }
}
