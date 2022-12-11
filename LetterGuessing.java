import java.util.Scanner;

public class LetterGuessing {

	public static void main(String[] args) {
		
	 
		
	

		try (Scanner scan = new Scanner(System.in)) {
			String choice;
			    do{          
			choice="y";
			    System.out.println("I have a Secret Letter (A-Z) Can you guess it?");
			    String user_letter=scan.nextLine();
			    char input_letter=Character.toUpperCase(user_letter.charAt(0));
			    char[] chars ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			    int[] range={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
			    int user_int=0;
			    int user_loop=0;
			    char rand_letter=chars[(int)(Math.random()*26)];
			    int comp_int=0;
for(int i=0;i<chars.length;++i)
			        {
			            if(rand_letter==chars[i])
			            {
comp_int=range[i];
			            }
			        }
			        //this loop is for getting the int value of user inputed letter
			        for(char i:chars)
			        {
			            if(input_letter==i)
			            {
			                user_int=range[user_loop];
			            }
			            ++user_loop;
			        }
//test the entered letter of user
			    if(input_letter==rand_letter)
			    {
			        System.out.println("Correct Guess");
			        System.out.println("The letter is:"+rand_letter);
      System.out.println("Do you want to play again?(y/n)");
      choice=scan.next();
			    }
			    //test the entered letter of user if greater than computer input
			    else if(user_int>comp_int)
			    {
			        System.out.println("Incorrect Guess");
			        System.out.println("Try Something Smaller");
			        System.out.println("The letter is:"+rand_letter);
			    continue;
			    }
			    //test the entered letter of user if lesser than computer input
			    else if(user_int<comp_int)
			    {
			        System.out.println("Incorrect Guess");
			        System.out.println("Try Something higher");
			        System.out.println("The letter is:"+rand_letter);
			    continue;
			    }
   }
			while(choice.equalsIgnoreCase("y"));
		}
	}

}
