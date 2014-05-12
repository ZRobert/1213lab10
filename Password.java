//Robert Payne
//L02
//6-19-2012
   import java.util.Scanner;

    public class Password{
   
       public static void main(String[] args)
      {
   		//user's password      
			String password;
   		//scanner object for keyboard input      
			Scanner keyboard = new Scanner(System.in);
   		//boolean flags to check the validity of the password      
			boolean lowerCasePass = false;
         boolean upperCasePass = false;
         boolean digitPass = false;
			boolean isValid = false;
    		
			//repeats until the user inputs a valid password  
   		while(!isValid)
			{      
				
				System.out.println("Enter your new password: ");
   	      password = keyboard.nextLine();
      		
				//checks the password length
    	     	if(password.length() < 6)
     	       	System.out.println("INVALID PASSWORD! NOT LONG ENOUGH!");
      	   else	//if the password length is good, checks for uppercase, lowercase, and digit
    			{        
					for(int i = 0; i < password.length(); i++)
            	{
               	if(Character.isDigit(password.charAt(i)))
                  	digitPass = true;
               
						if(Character.isUpperCase(password.charAt(i)))
                  	upperCasePass = true;
               
						if(Character.isLowerCase(password.charAt(i)))
                  	lowerCasePass = true;
            	}
         		if(lowerCasePass && upperCasePass && digitPass)//if everything is good...
            		System.out.println("VALID PASSWORD");			//outputs "VALID PASSWORD"
        	 		else
      				{      		//if not good, "INVALID PASSWORD" w/ reason
							System.out.println("INVALID PASSWORD: 1 UPPERCASE, 1 LOWERCASE, 1 DIGIT REQUIRED");
  							boolean lowerCasePass = false;	//resets the booleans for the next check
         				boolean upperCasePass = false;
         				boolean digitPass = false;		
						}
				}			    
			}
   	}
	}		
