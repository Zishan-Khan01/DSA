class PrintNthFibNumber{
	public static int printNthFibNumber(int n){
		if(n==0 || n==1){
			return n;
		}
		int fnm1 = printNthFibNumber(n-1);  //Fibonacci of (n-1)
		int fnm2 = printNthFibNumber(n-2);  //Fibonacci of (n-2)
		int fn = fnm1 + fnm2 ;
		return fn;
	}


	public static void main(String args[]){
		int n = 5;
		System.out.println(printNthFibNumber(n));
	}
}