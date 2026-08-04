public class hollowRhombus{

	public static void hollowRhombus(int n){
		
		for(int i=1; i<=n; i++){
			//printing n-i spaces in each line
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			//printing hollow rhombus
			for(int j=1; j<=n; j++){
				if(i==1 || i==n || j==1 || j==n){	//since spaces have already been printed in each line now j==1 and j==n will give slant right and left boundaries of rhombus
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			//after printing each row print next line
			System.out.println();
		}

	}

	public static void main(String[] args){
		hollowRhombus(7);
	}
}