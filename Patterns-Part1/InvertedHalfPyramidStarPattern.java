public class InvertedHalfPyramidStarPattern{
	public static void main(String[] args){
		int n=4;
		
		//logic 1
		for(int line=1; line<=n; line++){
			for(int star=1; star<=n-line+1; star++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
				
		//my logic
		for(int line=1; line<=n; line++){
			for(int star=n-line+1; star>=1; star--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();



		//another approach
		int a = 4;
		for(int line=1; line<=4; line++){
			for(int star=1; star<=a; star++){
				System.out.print("*");
			}
			a--;
			System.out.println();
		}

	}
}


//O/P:-
//****
//***
//**
//*