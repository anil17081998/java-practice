import java.util.Scanner;
class RedCrossTents
{
	public static void main(String...arg) {
		//System.out.println("Enter tent number");
        Scanner sc = new Scanner(System.in);
        int tent = sc.nextInt();
		int[] arr = new int[tent];
		int total = 0;
		for(int i=0; i<arr.length; i++){
        	arr[i] = sc.nextInt();
		}
        for( int x:arr){
			total = total + x;	
        }
        System.out.println(total);          
		}		
}