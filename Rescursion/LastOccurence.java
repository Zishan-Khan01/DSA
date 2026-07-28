class LastOccurence{
	public static int lastOccurence(int arr[], int key, int i){
		if(i == arr.length){
			return -1;
		} 
		int isFound = lastOccurence(arr, key, i+1);	//stores the index of key at its last occurence
		if(isFound != -1){
			return isFound;
		}
		if(arr[i] == key){
			return i;
		}
		return isFound;
	}
	public static void main(String args[]){
		int arr[] = {1,2,4,5,3,6,7};
		System.out.println(lastOccurence(arr, 3, 0));
	}
}