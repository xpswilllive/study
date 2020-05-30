package concurrency;

class GetFibonacci implements Runnable {

	// 需要输出几个数字
	private int count;
	// 当前输出到第几个数字
	private int num;

	public GetFibonacci(int n) {
		super();
		count = n;
	}

	public int next() {
		return fib(num++);

	}

	private int fib(int num) {
		// 判断当前是第几个数字
		if (num < 2) {
			return 1;
		}
		return fib(num - 1) + fib(num);

	}

	@Override
	public void run() {
		GetFibonacci fibonacci = new GetFibonacci(10);
		for (int i = 0; i < count; i++) {
			System.out.println(fibonacci.next());
		}

	}

}

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
