public boolean wordBreak(String s, Set<String> wordDict){
	boolean [] f = new boolean [s.length()+1];
	f[0]=true;
	for(int i=0; i<=s.length(); i++){
		for(int j = 0; j<i; j++){
			if(f[j]&&wordDict.contains(s.substring(j,i))){
				f[i] = true;
				break;
			}
		}
	}
	return f[s.length()];
}
