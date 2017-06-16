class HashTable {

	private int array_size = 57;
	private LinkedList[] this_ht;

	public HashTable() {
		this_ht = new LinkedList[array_size];
	}

	public Integer hash(char key){
		int char_num = Character.getNumericValue(key);
		return char_num % array_size;
	}

	public boolean addData(char key) {
		int hash_key = hash(key);
		// System.out.println(key);
		// System.out.println(hash_key);
		// System.out.println(this_ht[hash_key]);
		if(this_ht[hash_key] == null){
			Link this_link = new Link();
			this_ht[hash_key] = new LinkedList(this_link);
			return true;
		} else {
			return false;
		}
	}

}
