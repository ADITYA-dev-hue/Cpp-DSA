import java.util.Scanner;
class Question{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
					
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<a;i++){
			
			if(arr[i]==9){
				System.out.println("Element found");
				break;
			}else{
				System.out.println("Element Not Found");
			}
		}
		int min=arr[0] , max=arr[0];
		int sum=0;
		for(int i=0;i<a;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
			sum = sum + arr[i];
		}
		System.out.print("Sum " + sum + "\nMaximum: " + max + "Min: " + min);
	}
}