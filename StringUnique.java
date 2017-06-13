class StringUnique{
	
	public String req;
	public Boolean res;

	public StringUnique(String str){
		HashTable str_hash = new HashTable();
		for(int i = 0; i < str.length(); i++){
			str_hash.addData(str.charAt(i));
		}
		System.out.println(str);
		req = str;
		res = false;
	}

}
