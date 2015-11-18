package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.HashSet;
import java.util.Set;

/**
 * Test application for labyrinth game
 * 
 */
public class TestLabyrinthGame
{
	/**
	 * Application's main
	 * 
	 * @param args
	 *            command-line arguments (none expected here)
	 */
	public static void main(String[] args)
	{
		Set<Position> blockPositions = new HashSet<Position>();
		blockPositions.add(new Position(2,0));
		blockPositions.add(new Position(3,0));
		blockPositions.add(new Position(0,1));
		blockPositions.add(new Position(0,2));
		blockPositions.add(new Position(1,2));
		blockPositions.add(new Position(3,2));
		blockPositions.add(new Position(3,3));
		int nbBlockPosition;
		for(nbBlockPosition=0 ; nbBlockPosition < blockPositions.size() ; nbBlockPosition ++){
			
			LabyrinthBuilder.addForbiddenPosition(blockPositions nbBlockPosition);
			
		}
			new LabyrinthGame(new LabyrinthBuilder(4,4,new Position(3,1),blockPositions), RobotArtificialIntelligence.makeProduct(args[0])).play();
	}
}
