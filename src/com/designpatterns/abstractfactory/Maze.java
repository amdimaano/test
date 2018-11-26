package com.designpatterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Maze {
	private List<Room> rooms;
	
	public Maze() {
		rooms = new ArrayList<>();
	}
	
	public void addRoom(Room room) {
		rooms.add(room);
	}
}
