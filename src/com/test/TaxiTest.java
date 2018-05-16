package com.test;

public class TaxiTest {

	public static void main(String[] args) {

		int speed = 10;
		int distance = 300;
		int stops = 5;
		int kmRate = 7;
		int secondsRate = 3;
		Thread meter = new Thread(new TaxiMeter(kmRate, secondsRate, speed, distance, stops));

		meter.start();

	}
}
