int updateBits(int n, int m, int i, int j) {
	int allOnes = ~0; // will equal sequence of all ones

	// 1s before position j, then 0s
	int left = allOnes << (j+1); // left = 11100000
	int right = ((1 << i) - 1); // right = 00000011
	int mask = left | right;:

	int n_cleared = n & mask;
	int m_shifted = m << i;
	
	return n_cleared | m_shifted;
}
