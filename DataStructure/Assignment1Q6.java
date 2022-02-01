import java.util.*;
public class Assignment1Q6 {
	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int c=0;
           outerloop:
           for(int i=0;i<3;i++)
   		{
   		 String userId = "Ajay" ,password =  "Password" ;
   		 System.out.println("Enter userid");
   		 String u =sc.next();
   		 System.out.println("Enter password");
   		 String p =sc.next();
   		
   		 c++;
   		
           System.out.println("enter user name and password");
           while(c<4)
           {
        	   if(u.equals(userId) && p.equals(password))
        	   {
        		   System.out.println("Wellcome Ajay");
        		   break outerloop;
        	   }
        	   else
        	   {
        		   System.out.println(" You have entered wrong credentials ,please enter the right credentials.");
        		   break;
        	   }
           }
           if(c>3)
           {
        	   if(!u.equals(userId) || !p.equals(password))
 			  {
 				  System.out.println("You have entered wrong credentials 3 times");
 				  System.out.println("Contact Admin");
 				  
 			  }
        	   
           }
   		}
	}

}
