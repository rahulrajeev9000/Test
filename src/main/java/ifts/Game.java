package ifts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class Game {

	public void game() {
	
		
			//while Player(int x, int y) != treasure(int x, int y) {
			//while the location of the player doesn't equal the location of the treasure
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
	
	System.out.println("You are now stuck in an infite swamp. Find the treasure to get out of the swamp. Don't get lost or find yourself in trouble");
	System.out.println("Use keys W, A, S and D to move");{
	if (s  == "W") {
		// update player location +1 in y direction
		System.out.println("you have moved 1 m North");
	}
	if (s == "A") {
		// update player location -1 in x direction
		System.out.println("you have moved 1 m West");
	}
	if (s == "S") {
		// update player location -1 in y direction
		System.out.println("you have moved 1 m South");
	}
	if (s == "D") {
		// update player location +1 in x direction
		System.out.println("you have moved 1 m East");
	}
	}
		}
		//System.out.println("you have won the game");
	}
	
