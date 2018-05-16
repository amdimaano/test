package com.test;

public class PerKmCharge implements Runnable {

	int rate;
	int speed;
	int distance;
	int currentDistance = 0;

	public PerKmCharge(int rate, int speed, int distance) {
		super();
		this.rate = rate;
		this.speed = speed;
		this.distance = distance;
	}

	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		long waitStart = 0L;
		boolean isDone = false;
		while (!isDone) {
			try {
				if (Thread.interrupted()) {
					System.out.println("Per km charging is interrupted! Waiting...");
					waitStart = System.currentTimeMillis();
					this.wait();
				}

				Thread.sleep(500);
				
				long currentTime = System.currentTimeMillis();
				long waitTime  = 0L;
				if (waitStart > 0) {
					waitTime = currentTime - waitStart;
				}
				long totalTimeMillis = currentTime - startTime - waitTime;
				int seconds = (int) (totalTimeMillis / 1000);
				currentDistance = seconds * speed;
				System.out.println("Total distance: " + currentDistance);
				if (currentDistance >= distance) {
					return;
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}

	public int getDistance() {
		return distance;
	}

	public int getCurrentCharge() {
		return currentDistance * rate;
	}

}
