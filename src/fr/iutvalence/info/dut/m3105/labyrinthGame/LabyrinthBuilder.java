package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.Set;

public class LabyrinthBuilder {
	

	private int width;
	private int height;
	private final Position exitPosition;
	private Set<Position> forbiddenCellsPositions;

	
	
	
	public LabyrinthBuilder(int width, int height, Position exitPosition,Set<Position> forbiddenCellsPositions ){
		this.width = width;
		this.height = height;
		this.exitPosition = exitPosition;
		this.forbiddenCellsPositions = forbiddenCellsPositions ;
		}
	

	public LabyrinthBuilder setWidth(int width) throw widthException {
		if(width < 1){
			throw new widthException();
		}
			
		this.width = width;
		return this;
	}
	
	public LabyrinthBuilder setHeight(int h) throw heightException{
		if(height < 1){
			throw new heightException();
		}
			
		this.height = height;
		return this;
	}

	public LabyrinthBuilder setExitPosition(Position position){
		
		this.exitPosition=position;
		
		
	}

	public LabyrinthBuilder addForbiddenPosition(Position position){
		this.forbiddenCellsPositions.add(position);
		return this;
		}
	
	
	public Labyrinth getLabyrinth(){
		return new Labyrinth(this.width, this.height, this.forbiddenCellsPositions, this.exitPosition);
		}
	
	
	
	public LabyrinthBuilder addExitPosition(int w){
		return null;
	}
	
	public LabyrinthBuilder addHeight(int h){
		return null;
	}
	
}
