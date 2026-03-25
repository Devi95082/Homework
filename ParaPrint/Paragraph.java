package ParaPrint;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Paragraph 
{
    public static void main(String[] args)
    {
        String text= "HAI\n" +
                     "HAI SIR HOW CAN I HELP YOU\n" +
                     "CAN YOU TELL ME ABOUT JAVA\n" +
                     "SURE, JAVA IS AN PROGRAMMING\n" +
                     "LANGUAGE WHICH IS USED FOR DEVELOP\n" +
                     "APPLICATIONS WITH PLATFORM\n" +
                     "INDEPENDENT";
        for(int i=0;i<text.length();i++)
        {
           System.out.print(text.charAt(i));
            try 
            {
                Thread.sleep(300);
            } 
            catch (InterruptedException ex)
            {
                Logger.getLogger(Paragraph.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
   
}
