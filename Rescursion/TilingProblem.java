class TilingProblem{
	public static int tilingPrblm(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		//if first tile is lied vertically, 1 unit of space is occupied by the tile and now remaining space is n-1
		int fnm1 = tilingPrblm(n-1);

		//if first tile is lied horizontally, 2 unit of space is occupied by the tile and now remaining space is n-2
		int fnm2 = tilingPrblm(n-2);

		int totWays = fnm1 + fnm2;
		return totWays;
	}
	public static void main(String args[]){
		System.out.println(tilingPrblm(4));
	}
}