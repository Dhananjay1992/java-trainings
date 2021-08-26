public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("I am inside main method");
		System.out.println("Welcome to world of Java with DJDeveloper");
		System.out.println(args[0]);
		if (args.length>0) System.out.println("Detected arguments: " + args);
		String message = args.length > 0 ? display(args[0]) : "args not passed during runtime";
	}

	static public String display(String args) {
		System.out.println("Printing args: " + args);
		System.out.printf("Printing args: %s", args);
		return String.format("Printing args: %s" , args);
	}
}
