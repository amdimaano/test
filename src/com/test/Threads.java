package com.test;

public class Threads {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int j = 0; j < 10; j++) {
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						System.out.println("Hello interrupted!");
						return;
					}
					System.out.println("Hello : " + j);
				}
				System.out.println("Hello is finished!");
			}
		});
		
		long start = System.currentTimeMillis();
		
		t.start();
		
		while(t.isAlive()) {
			System.out.println("Waiting...");
			t.join(1000);
			if (System.currentTimeMillis() - start > 10000) {
				t.interrupt();
			}
		}
		
		
		System.out.println("Finished!");

	}
}
