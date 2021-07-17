import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args)  {
		System.out.println("Lets play a game of Rock, Paper, Scissors!");
		
		
		Scanner in = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter your move! (rock, paper or scissors.)\n To exit, type 'quit'");
			String playerMove = in.next();
			
			if(playerMove.equals("quit")) {
				break;
			}
			
			if(!playerMove.equals("rock") && !playerMove.equals("paper")&& !playerMove.equals("scissors") ) {
				System.out.println("Please enter a valid move");
				
				
			}
			
			
			
			else {
				int rand =(int) (Math.random()*3);
			
	 
			String computerMove = "";
			
			if(rand == 0) {
				computerMove = "paper";
				System.out.println("i chose paper");
				
			}
			
			else if (rand == 1) {
				computerMove = "scissors";
				System.out.println("i chose scissors");
				
			}
			else if (rand == 2) {
				computerMove = "rock";
				System.out.println("i chose rock");
			}
			if(computerMove.equals(playerMove)) {
				System.out.println("tie game!");
			}
				 
			else if (computerMove.equals("scissors")&& playerMove.equals("paper")|| computerMove.equals("paper") && playerMove.equals("rock")|| computerMove.equals("rock")&& playerMove.equals("scissors")) {
					System.out.println("You lose");
			}
			
			
			else {
				System.out.println("You win!");
			}
			
			try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	 
			
			
			
			
			
			
			
			
			
		}
		
		

	}

}
}
