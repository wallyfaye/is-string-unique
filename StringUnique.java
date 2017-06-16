class StringUnique{
	
	public String req;
	public Boolean res = true;

	public StringUnique(String str){
		req = str;
		HashTable str_hash = new HashTable();
		int i = 0;
		while(res && i < str.length()){
			if(!str_hash.addData(str.charAt(i))){
				res = false;
			}
			i++;
		}
		
	}

}
