

import java.util.Scanner;
import java.util.Random;

public class FindTreasure
{
	
	public static int damage=100;
	public static int score=0;
	
	public static void main(String args[])
	{
	  System.out.println("Welcome to the FindTreasure game!. ");
	  System.out.println("Find the treasure or die!.");
	  System.out.println();
	  System.out.println();
	  
	  startGame();
	  clear();
	  
	}
	
public static void confir()
	 {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("1. Start The Game");
		 System.out.println("2. End The Game");
		 System.out.println("Enter Your choice: ");
		 
		 int choice = scanner.nextInt();
		 
		 if(choice == 1)
		 {
			 startGame();	 
		 }
		 else
		 {
			 System.out.println();
			 System.out.println("Game Over!");
			 System.out.println("Your Damage Score:" + Damage);
			 System.out.println("You Collected Score:" + score);		 
		 }
		 pause();
		 clear();	 
	 }
	
 public static void startGame()
    {
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("Let's start the game!!!!.");
	  System.out.println("1. Explore The Dark Cave");
	  System.out.println("2. Walk Through the dark Forest");
	  System.out.println("Enter Your Choice: ");
	  
	  int choice = scanner.nextInt();
	  System.out.println();
	  
	  clear();
	  if(choice == 1)
	  {
		  exploreCave();
	  }
	  else if(choice == 2)
	  {
		enterForest();  
	  }
	  else
	  {
		  System.out.println("Invalid Choice!. Game Over!");
	  }
	  
	  clear();
	  scanner.close();
	  
    }
	  
 public static void exploreCave()
    {
    	System.out.println("You Enter The Dark Cave and Discover A Treasure box!!.");
    	System.out.println("1. Open The Box");
    	System.out.println("2. Leave The Cave");
    	System.out.println("Enter your Choice: ");
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int choice = scanner.nextInt();
    	System.out.println();
    	System.out.println();
    	
    	if(choice == 1)
    	{
    		int z = exploreRandom();
    		if(z == 0)
    		{
    			System.out.println("A Small Creature Comes Out Of The Box & Eats You Alive!!.");
    			System.out.println("Sorry! You died.");
    			
    			System.out.println("You Collected Score:" + score);
    			pause();
    		}
    		else
    		{
    			System.out.println("You Find Out Treasure!.");
    			score = score+20;
    			System.out.println("Your Score :" + score);
    			System.out.println("You Are Now Good To Go Ahead");
    			pause();
    			clear();
    			confir();
    			
    		}
    	}
    	else if(choice == 2)
    	{
    		System.out.println("You Leave The Cave & Continue Your Advanture");
    		confir();	
    	}
    	else
    	{
    		System.out.println("Invalid Choice. Game Over!!.");		
    	}
    	scanner.close(); 	  
    }
    
public static int exploreRandom()
    {
   	 Random rand = new Random();
   	 int ran = rand.nextInt();
   	 return ran;	 
    }
    
    
 public static void enterForest()
 {
	 System.out.println("You Walk Through The Dark Forest And Encounter A Dangerous Big Creature!");
	 System.out.println("1. Fight With Creature");
	 System.out.println("2. Continue Walking");
	 System.out.println("Enter Your Choice:");
	 
	 Scanner scanner = new Scanner(System.in);
	 int choice = scanner.nextInt();
	 
	 clear();
	 
	 if(choice == 1)
	 {
		 int z= exploreRandom();
		 if(z == 0)
		 {
			 System.out.println("The Creature Has Captured You and Eat You Alive!.");
			 System.out.println("Sorry! You Died");
			 System.out.println("you Collected Score: "+ score);
			 pause();
		 }
		 else
		 {
			 System.out.println("You Win The Battle! Congratulation.");
			 score = score+20;
			 System.out.println("Your score: " + score);
			 System.out.println("You Are Now Good To Go Ahead ");
			 
			 pause();
			 clear();
			 confir();		 
		 }
	 }
	 else if(choice == 2)
	 {
		 System.out.println("You Continue walking Through The Forest.");
		 confir();
	 }
	 else
	 {
		 System.out.println("Invalid Choice. Game Over!");		 
	 }
	 
	 scanner.close();
 }
 public static void pause()
 {
	 Scanner s = new Scanner(System.in);
	 s.next();
 }
 
 
 public static void clear()
 {
	 System.out.println("\033[H\033[2J");
	 System.out.flush();
 } 
}
