
package guessnumbergame;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author hasib
 */
public class GuessNumberGame {

    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String userName;
        
        SecureRandom random=new SecureRandom();
        int hiddenNum=random.nextInt(20);
        //System.out.println(hiddenNum);
        
        System.out.println("Welcome to the game of guessing numbers");
        System.out.print("Please enter your name:");
        userName=scan.nextLine();
        System.out.print("Hello "+userName+", are you ready to play this game?"
                + "\n, if yes, press any key and Enter to continue. . .");
        scan.next();
        
        System.out.println("You have to guess a number from 1-20. You will be given"
                + " 4 chances, \nthe sooner you find the number, the better you score");
        int i=1;
        int score=100;
        boolean flag=true;
        System.out.println("Here we go......");
        while(i<=4)
        {
            System.out.printf("Chance %d , enter your guess= ",i);
            int guessNum=scan.nextInt();
            if(hiddenNum==guessNum )
            {
                flag=true;
                break;
            }
            
            else if(hiddenNum>guessNum)
            {
                if(i==4) break;
                System.out.println("Too low. Please try again!!!");
                score/=2;
            }
            else if(hiddenNum<guessNum)
            {
                if (i==4) break;
                System.out.println("Too high. Please try again!!!");
                score/=2;
            }
            i++;
        }
        if(flag==true)
        {
            System.out.println("Congratulations, you have done it!!!");
                System.out.println("Your score = "+score);
        }
        else
        {
            System.out.println("You loose. Try again another time!!!");
        }
        
    }
    
}
