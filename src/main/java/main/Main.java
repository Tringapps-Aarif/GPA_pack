package main;

import calculation.*;
import update.Update;
import java.util.*;
import java.util.logging.Logger;

class Gpa
{
    public static void main(String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final Logger print = Logger.getLogger("Gpa");
        print.info("Enter your name:");
        String name=sc.nextLine();
        print.info("Enter your grade:");
        String grade=sc.nextLine();
        Calculation cal=new Calculation(name);
        print.info(cal.calculating(grade));
       Update updategpa= new Update();
        updategpa.updating();
    }
}

