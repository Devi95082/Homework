package numbergussinggame;

public class User
{

    
    public int check(int number,int number1,int i,int n) 
    {
      
       
            if (number > number1) 
            {
                System.out.println("Too High");
            
            } 
            else if (number < number1)
            {
                System.out.println("Too Low");
            } 
            else 
            {
                System.out.println("Correct! You won in " + i + " attempts.");
                return number;
            }
        

        if (i == n && number != number1) 
        {
            System.out.println("Game Over! The correct number was " + number1);
        }
    
        return number; 
    }

   
}
    
