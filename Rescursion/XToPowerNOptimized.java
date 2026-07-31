//T.C = logarithmic
class XToPowerNOptimized{
	public static int optimizedPower(int a, int n){
		if(n == 0){
			return 1;
		} 
		//int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2) ;  //T.C = O(n)


		int halfPower = optimizedPower(a, n/2);
		int halfPowerSq = halfPower * halfPower;  //T.C = O(log n) (Because only 1 Fxn call and only a multiplication)

		
		//n is odd
		if(n % 2 != 0){
			halfPowerSq = a * halfPowerSq;
		}
		return halfPowerSq;
	}
	public static void main(String args[]){
		System.out.println(optimizedPower(3, 3));
	}
}