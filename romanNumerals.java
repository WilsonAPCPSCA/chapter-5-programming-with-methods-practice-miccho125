import java.util.Scanner;
public class romanNumerals {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your number from 1-999: ");
		int x = in.nextInt();
		System.out.println(romanDigit(x));
	}
	
	public static String romanDigit(int n){
		String none = "";
		int p = n/100;
		int z = (n/10)%10;
		int y = n%10;

		if(p>=5){						//Hundreds digit place
			if(p==9){
				System.out.print("CM");
			}else{
				System.out.print("D");
				for(int i = 0; i<p-5;i++){
					System.out.print("C");
				}
			}
		}
		if(p<5){
			if(p==4){
				System.out.print("CD");
			}else{
				for(int i = 0; i<p;i++){
					System.out.print("C");
				}
			}
		}
		
		if(z>=5){							//ten digit place
			if(z==9){
				System.out.print("XC");
			}else{
				System.out.print("L");
				for(int i = 0; i<z-5; i++){
					System.out.print("X");
					}
			}
		}
		if(z<5){
			if(z==4){
				System.out.print("XL");
			}else{
				for(int i = 0; i < z; i++){
					System.out.print("X");
				}
			}
		}
		
		
		if(y>=5){							//one digit place
			if(y==9){
				System.out.print("IX");
			}else{
				System.out.print("V");
				for(int i = 0; i<y-5;i++){
					System.out.print("I");
				}
			}
		}	
		if(y<5){
			if(y==4){
				System.out.print("IV");
			}else{
				for(int i = 0; i<y;i++){
					System.out.print("I");
				}
			}
		}
		return none;
	}
}					