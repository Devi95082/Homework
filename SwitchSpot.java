import java.util.Scanner;
class SwitchSpot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Spotify");
		System.out.println("1. A R Rahman");
		System.out.println("2. Anirudh  ");
		System.out.println("3. Yuvan Shankar Raja");
		System.out.print("Enter your choise : ");
		
		int choise = sc.nextInt();
		
		switch(choise)
		{
			case 1:
			{  
			      System.out.println("1. Melody");
		          System.out.println("2. Folk");
		          System.out.print("Enter your Option : ");
	       		  int option = sc.nextInt();
			
			      if(option==1)
			      {
				    System.out.println("Now Playing");
			      }
			      else if(option==2)
			      {
				    System.out.println("Now Playing");
			      }
			      else
			      {
				    System.out.println("Invalid Music Type");
			      }
			}
			break;	  
			
			case 2:
			{
				System.out.println("1. Melody");
		          System.out.println("2. Folk");
		          System.out.print("Enter your Option : ");
	       		  int option = sc.nextInt();
			
			      if(option==1)
			      {
				    System.out.println("Now Playing");
			      }
			      else if(option==2)
			      {
				    System.out.println("Now Playing");
			      }
			      else
			      {
				    System.out.println("Invalid Music Type");
			      }
			}	  
			break;	

            case 3:
			{
   				  System.out.println("1. Melody");
		          System.out.println("2. Folk");
		          System.out.print("Enter your Option : ");
	       		  int option = sc.nextInt();
			
			      if(option==1)
			      {
				    System.out.println("Now Playing");
			      }
			      else if(option==2)
			      {
				    System.out.println("Now Playing");
			      }
			      else
			      {
				    System.out.println("Invalid Music Type");
			      }
			}	  
			break;	  			
		    
            default : 
            {
				System.out.println("Invalid Music Director");
			}			
		}
	}
}