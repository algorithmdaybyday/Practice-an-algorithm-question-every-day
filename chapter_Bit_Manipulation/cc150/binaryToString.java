String printBinary2(double num) {
	if (num >= 1 || num <= 0) {
		return "Error";
	}

	StringBuilder binary = new StringBuilder();
	double frac = 0.5;
	binary.append(".");
	while (num > 0) {
		if( binary.length() > 32) {
			return "Error";
		}
		if (num >= fraction) {
			binary.append("1");
			binary -= fraction'
		} else {
			binary.append("0");
		}
		frac /= 2;
	}
	return binary.toString();
}
