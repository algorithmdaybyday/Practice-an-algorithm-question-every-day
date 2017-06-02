public int read(char [] buf, int n){
	char[] buffer = new char[4];
	int readByte = 0;
	boolean eof = false;
	while (!eof && readBytes < n){
		int sz = read4(buff);
		if(sz < 4) eof = true;
		int bytes = Math.min(n - readBytes, sz);
		System.arraycopy(buffer, 0, buf, readBytes, bytes);
		readBytes += bytes;
	}
	return readBytes;

}
