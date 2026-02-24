class Loop{
	public static void main(String[] args){
		for(int i=0;i<=10;i++){
			//System.out.println(i);  // to print in new line 
			System.out.print(i+" ");  // to print in space separated formate
		}
		int i=0;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		i=0;
		do{
			System.out.print(" "+i);
			i++;
			
		}while(i<=10);

		System.out.println("\n");
		int arr[] = {10,30,40,50,60};
		// for each loop    
		//It helps to iterate whole container
		for(int x : arr){
			System.out.print(x +" ");
		}
	}
}