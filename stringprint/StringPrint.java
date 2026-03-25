package stringprint;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringPrint 
{

    public static void main(String[] args) 
    {
        String name[] ={"DIWAKAR","KARTHIK","RAJESH","SATHISH","SURYA"};
        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
            try 
            {
                Thread.sleep(2000);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(StringPrint.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
