package com.designpatterns.abstractfactory;


import java.util.List;

import lombok.Data;

@Data
public class Room {
	private List<Wall> walls;
	private Door door;
}
