class _Demo {
	public static void main(String[] args){
		if (args.length < 1){
			System.out.println("Please specify a string to test");
			System.exit(0);
		}
		StringUnique str1 = new StringUnique(args[0]);
		String result = new Boolean(str1.res).toString();
		System.out.println("The result of \"" + str1.req + "\" is: " + result);
	}
}
