package com.test;

import java.util.Random;

public class TaxiMeter implements Runnable {

	private int speed;
	private int distance;
	private int stops;
	private int kmRate;
	private int secondsRate;

	public TaxiMeter(int kmRate, int secondsRate, int speed, int distance, int stops) {
		super();
		this.speed = speed;
		this.distance = distance;
		this.stops = stops;
		this.kmRate = kmRate;
		this.secondsRate = secondsRate;
	}

	@Override
	public void run() {
		int currentStops = 0;
		int currentPerSecondsCharge = 0;
		int currentCharge = 0;

		PerKmCharge perKmRunnable = new PerKmCharge(kmRate, speed, distance);
		Thread perKmThread = new Thread(perKmRunnable);
		perKmThread.start();

		while (perKmThread.isAlive()) {
			try {
				Thread.sleep(3000);
				Random r = new Random();
				int seconds = r.nextInt(5);
				boolean inTraffic = r.nextBoolean() && currentStops < stops;
				System.out.println("Stuck in traffic: " +  inTraffic);
				if (inTraffic) {
					System.out.println("Stopping for " + seconds + " seconds...");
					perKmThread.interrupt();
					Thread.sleep(seconds * 1000);
					currentPerSecondsCharge += secondsRate * seconds;
					currentCharge = currentPerSecondsCharge + perKmRunnable.getCurrentCharge();
					currentStops++;
					perKmThread.notify();
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Total rate: " + currentCharge);

	}

}
