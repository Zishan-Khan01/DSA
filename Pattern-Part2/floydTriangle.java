public class floydTriangle{

	public static void floydTriangle(int n){
		int counter=1;
		for(int i=1; i<=n; i++){
			//how many times will counter be printed
			for(int j=1; j<=i; j++){
				System.out.print(counter+" ");
				counter++;
			}
			//after printing each row print next line
			System.out.println();
		}
	}

	public static void main(String[] args){
		floydTriangle(5);
	}
}