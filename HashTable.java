class HashTable {

	private int array_size = 57;

	public HashTable() {
	}

	public Integer hash(char key){
		int char_num = Character.getNumericValue(key);
		return char_num % array_size;
	}

	public boolean addData(char key) {
		System.out.println(key);
		System.out.println(hash(key));
		return false;
	}

}
