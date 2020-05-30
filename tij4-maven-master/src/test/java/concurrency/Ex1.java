package concurrency;

class TaskA implements Runnable {

	public TaskA() {
		super();
		System.out.println("TaskA initialize");
	}

	@Override
	public void run() {

		for (int i = 0; i < 300; i++) {
			System.out.println("Send messageA" + (i + 1));
			Thread.yield();
		}

		// a message of the end of task
		System.out.println("TaskA end");
		return;

	}

}

class TaskB implements Runnable {

	public TaskB() {
		super();
		System.out.println("TaskB initialize");
	}

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println("Send messageB" + (i + 1));
			Thread.yield();
		}

		// a message of the end of task
		System.out.println("TaskB end");
		return;

	}

}

class TaskC implements Runnable {

	public TaskC() {
		super();
		System.out.println("TaskC initialize");
	}

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println("Send messageC" + (i + 1));
			Thread.yield();
		}

		// a message of the end of task
		System.out.println("TaskC end");
		return;

	}

}

public class Ex1 implements Runnable {

	public Ex1() {
		super();
		System.out.println("Ex1 initialize");
	}

	public static void main(String[] args) {
		new Thread(new TaskA()).start();
		new Thread(new TaskB()).start();
		new Thread(new TaskC()).start();
	}

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println("Send message" + (i + 1));
			Thread.yield();
		}

		// a message of the end of task
		System.out.println("task end");

		return;

	}
}
