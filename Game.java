/**
 * Number Guessing Game using Java
 *
 * @author Sikta Roy
 * @date 20.06.2023
 */

import java.util.*;

public class Game {

    public static int guessNumber()
    {
      
        Scanner in = new Scanner(System.in);
                int num,tries=10,i,guess,score=0;
                // Generate a random number
        num = (int)(100 * Math.random()) + 1;
        
        for (i = 0; i < tries; i++) {

            System.out.println("Guess the number:");
            // Take input for guess
            guess = in.nextInt();
            // If the guess is correct
            if (num == guess) {
                System.out.println("Congratulations! You guessed the number.");
                score=1;
                break;
            }
            // If the guess is lower
            else if (num > guess) 
            {
                System.out.println("Unfortunately ,the entered number is lower.");
            }
            // If the guess is higher
            else if (num < guess) 
            {
                System.out.println("Unfortunately ,the entered number is higher.");
            }
        }

        if (i == tries) {
            System.out.println("You couldn't guess the number right.");
        }
       return score;
}

    
    public static void main(String[] args) 
    {
        int i,j,s,totalScore=0;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println(" *************** Welcome to the NUMBER GUESSING GAME *************** \n A number between 1 and 100 (both included) is generated and you will have to guess it correctly.\n The number of tries given per round is 10");
        
        for (i = 1;i>0 ;i++) {
             System.out.println("*********** Round "+ i +"***********");
             s=guessNumber(); //calling the function
             totalScore=totalScore+s;
             System.out.println("Do you want to go for next round ? Enter Y for Yes and N for No");
             for(j=1;j<=1;j++)
             {
                 ch=sc.next().charAt(0); // taking character input
             if(ch=='y'||ch=='Y') //for yes
                 System.out.print("");
             else if(ch=='n'||ch=='N') //for no
             {
                 i=-1;
                 break;
                }
             else 
             {  
                 System.out.println("You entered wrong choice ! Try Again .");
                 j--;
                }
                }
    }
    System.out.println("*********  Score : "+totalScore+"  ********* \n *** Thank you for playing   ***");
}
}

