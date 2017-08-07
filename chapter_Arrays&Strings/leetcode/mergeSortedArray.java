void merge (int A[], int m, int B[], int n) {
	int i = m - 1;
	int j = n - 1;
	int k = m + n - 1;
	while (i >= 0 && j >= 0) {
		if (A[i] > B[i])
			A[k--] = A[i--];
		else
			A[k--] = B[j--];
	}
	while (j>=0)
		A[k--] = B[j--];
}
