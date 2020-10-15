class Solution {

	public int[] shuffle(int[] nums, int n) {
		int x[] = new int[n];
		int y[] = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = nums[i];
			y[i] = nums[n+i];
		}
		
		int a=0, b=0;
		
		for(int i=0; i<n*2; i++) {
			if(i%2==0)
				nums[i] = x[a++];
			else
				nums[i] = y[b++];
		}

		return nums;
	}
  
}
