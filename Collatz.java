// Demonstrates the Collatz conjecture.
public class Collatz
 {
	public static void main(String args[]) 
	{
	    // Replace this comment with your code
	int N= Integer.parseInt(args[0]);
	String mode= args[1];
	boolean verbose= mode.equals("v");
		for(int seed=1; seed<=N; seed++)
		{
			int i = seed;
			int steps = 1;
			if (verbose) {
				System.out.print(seed + " ");
			}
			// ensure we always advance at least once so seed=1 prints 1 4 2 1 as required
			do {
				if (i % 2 == 0) {
					i = i / 2;
				} else {
					i = (3 * i) + 1;
				}
				steps = steps + 1;
				if (verbose) {
					System.out.print(i + " ");
				}
			} while (i != 1);
			if (verbose) {
				System.out.println("(" + steps + ")");
			}
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
