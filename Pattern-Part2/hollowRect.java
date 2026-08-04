class HollowRect{
	public static void hollowRect(int totRows, int totCols){
		
		for(int i=1; i<=totRows; i++){
			for(int j=1; j<=totCols; j++){
				//cell no. - (i,j)
				//condition for checking boundary cell to print star
				if(i == 1 || i == totRows || j == 1 || j == totCols){
					System.out.print("*");
				//else print space
				}else{
					System.out.print(" ");
				}
			}
			//after printing each row print next line
			System.out.println();
		}
	}


	//my approach
	public static void myApp(int a,int b){
		for(int i=1; i<=a;i++){
			for(int j=1; j<=b;j++){
				if((i==2 || i==3) && (j==2 || j==3 || j==4)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}


	public static void main(String[] args){
		hollowRect(4,5);
		System.out.println();
		System.out.println();
		myApp(4,5);
	}
}