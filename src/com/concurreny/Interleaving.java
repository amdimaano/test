package com.concurreny;

public class Interleaving {

	public static void main(String[] args) {
		UniqueValue value = new UniqueValue();

		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.println("Value: " + value.getNextValue());
				}
			});
			t.start();

		}

	}

	static class UniqueValue {
		private int value;

		public int getNextValue() {
			return value++;
		}
	}

}
