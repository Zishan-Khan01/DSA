public class diamondPattern{

	public static void diamondPattern(int n){
		//printing upper half
		for(int i=1; i<=n; i++){
			//printing n-i spaces in each line
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			
			//printing (2*i)-1 stars in each line
			for(int j=1; j<=(2*i)-1; j++){
				System.out.print("*");
			}
			//after printing each row print next line
			System.out.println();
		}

		//printing lower half
		for(int i=n; i>=1; i--){
			//printing n-i spaces in each line
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			
			//printing (2*i)-1 stars in each line
			for(int j=1; j<=(2*i)-1; j++){
				System.out.print("*");
			}
			//after printing each row print next line
			System.out.println();
		}
	}

	public static void main(String[] args){
		diamondPattern(7);
	}
}