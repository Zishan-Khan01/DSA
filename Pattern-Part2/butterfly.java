public class butterfly{

	public static void butterfly(int n){
		
		//printing upper half
		for(int i=1; i<=n; i++){
			//printing i stars in each line
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			//printing 2*(n-i) spaces in each line
			for(int j=1; j<=2*(n-i); j++){
				System.out.print(" ");
			}
			//printing i stars in each line
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			//after printing each row print next line
			System.out.println();
		}

		//printing lower half
		for(int i=n; i>=1; i--){
			//printing i stars in each line
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			//printing 2*(n-i) spaces in each line
			for(int j=1; j<=2*(n-i); j++){
				System.out.print(" ");
			}
			//printing i stars in each line
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			//after printing each row print next line
			System.out.println();
		}
	}

	public static void main(String[] args){
		butterfly(5);
	}
}

//O/p:
//*        *
//**      **
//***    ***
//****  ****
//**********
//**********
//****  ****
//***    ***
//**      **
//*        *
