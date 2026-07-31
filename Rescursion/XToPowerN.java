//T.C = exponential
class XToPowerN{
	public static int xToPowerN(int x, int n){
		if(n == 0){
			return 1;
		} 
		//int xnm1 = xToPowerN(x, n-1);   //x^n-1
		//int xn = x * xnm1;		//x^n
		//return xn;

		return x * xToPowerN(x, n-1);   //T.C = 2^n
	}
	public static void main(String args[]){
		System.out.println(xToPowerN(3, 3));
	}
}