package com.concurreny;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class TimeTest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		t.start();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello : " + i);
		}
		
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
