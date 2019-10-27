/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author franciscocastrowetzstein
 */
import java.util.Scanner;

public class CardGame {

    /**
     * @param args the command line arguments
     */
    private static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        cardGame();
    }
    
    public static int cardGame() {
        
        int randomNum = (int)(Math.random() * 10 + 1);
        
        System.out.println("Guess my card number...");
        int userNum = kb.nextInt();
        
        
        if(randomNum == userNum){
            System.out.println("Congrats you guessed correctly!");
        }
        else if (randomNum != userNum){
                if(userNum > randomNum){
                System.out.println("Too High!");
            }
                else if (userNum < randomNum){
                System.out.println("Too Low!");
            }
        }
        
        while (randomNum != userNum){
                    System.out.println("Please try again.");
                int userNum2 = kb.nextInt();
                
                if(randomNum == userNum2){
            System.out.println("Congrats you guessed correctly!");
            return 0; 
                }
                else if(userNum2 > randomNum){
                System.out.println("Too High!");
            }
                else if (userNum2 < randomNum){
                System.out.println("Too Low!");
                                }
                 if(randomNum == userNum2){
            System.out.println("Congrats you guessed correctly!");
        }
        
    }
        return 0;
    
}
