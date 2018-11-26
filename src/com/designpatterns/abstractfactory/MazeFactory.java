package com.designpatterns.abstractfactory;

import java.util.Arrays;

public abstract class MazeFactory {

	public Maze createStandardMaze() {
		Maze maze = new Maze();
		Room room1 = makeRoom();
		room1.setDoor(makeDoor());
		room1.setWalls(Arrays.asList(makeWall(), makeWall(), makeWall(), makeWall()));
		maze.addRoom(room1);

		Room room2 = new Room();
		room2.setDoor(makeDoor());
		room2.setWalls(Arrays.asList(makeWall(), makeWall(), makeWall(), makeWall()));
		maze.addRoom(room2);

		return maze;
	}

	public abstract Room makeRoom();

	public abstract Wall makeWall();

	public abstract Door makeDoor();
}
