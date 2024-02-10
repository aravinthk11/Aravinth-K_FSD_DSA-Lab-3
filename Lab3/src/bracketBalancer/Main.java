package bracketBalancer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckBracket balance = new CheckBracket("*{([])})");
		
		balance.check();
	}

}
