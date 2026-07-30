class FriendsPairing{
	public static void friendsPairing(int n){
		if(n == 1 || n == 2){
			return n;
		}
		//choices
		//single
		int fnm1 = friendsPairing(int n-1);
		
		//pair
		int fnm2 = friendsPairing(int n-2);
		int pairWays = (n-1) * fnm2;

		//totWays
		int totWays = fnm1 + pairWays;
		return totWays;
	}
	public static void main(String args[]){
		friendsPairing(3);
	}
}