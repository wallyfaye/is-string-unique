class StringUnique{
	
	public String req;
	public Boolean res = true;

	public StringUnique(String str){
		
		req = str;
		HashTable str_hash = new HashTable();
		for(int i = 0; i < str.length(); i++){
			if(!str_hash.addData(str.charAt(i))){
				res = false;
			}
		}
		System.out.println(str);
	}

}
