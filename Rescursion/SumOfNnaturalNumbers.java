class SumOfNnaturalNumbers{
	public static int sumOfNnaturalNumbers(int n){
		if(n==1){
			return 1;
		}
		int snm = sumOfNnaturalNumbers(n-1);  //sum(n-1)
		int sn = n + snm;  	//sum of n
		return sn;
	}


	public static void main(String args[]){
		int n = 5;
		System.out.println(sumOfNnaturalNumbers(n));
	}
}