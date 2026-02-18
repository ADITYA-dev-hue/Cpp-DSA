class CommandLineArgument{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("No Argument");
		}else{
			System.out.println("Argument 1: " + args[0]);
			System.out.println("Argument 2: " + args[1]);
			System.out.println("Argument 3: " + args[2]);
		}
	}
}