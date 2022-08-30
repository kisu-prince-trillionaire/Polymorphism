package SumOverloading;

public class LearnOverloading {
	public int sum(int x, int y) {
		return x+y;
	}
	
	public int sum(double x, int y) {
		return (int)x+y;
	}
	
	public int sum(int x, double y) {
		return x+(int)y;
	}
	
	public int sum(double x, double y) {
		return (int)x+(int)y;
	}
	
}
