import java.util.Scanner;
public class timeEnglish {
	public static void main (String[]args){
		Scanner in = new Scanner(System.in);
		System.out.print("What time is it? (Enter time as 0:00 or 00:00)");
		String x = in.nextLine();
		System.out.println(getTimeName(x));
	}
	public static String getTimeName(String time){
		String first = "";
		String second = "";
		String third = "";
		int x = 0;
		if(time.length()==4){
			if(time.substring(0,1).equals("1")){
				first = "one";
				x=1;
			}
			if(time.substring(0,1).equals("2")){
				first = "two";
				x=2;
			}
			if(time.substring(0,1).equals("3")){
				first = "three";
				x=3;
			}
			if(time.substring(0,1).equals("4")){
				first = "four";
				x=4;
			}
			if(time.substring(0,1).equals("5")){
				first = "five";
				x=5;
			}
			if(time.substring(0,1).equals("6")){
				first = "six";
				x=6;
			}
			if(time.substring(0,1).equals("7")){
				first = "seven";
				x=7;
			}
			if(time.substring(0,1).equals("8")){
				first = "eight";
				x=8;
			}
			if(time.substring(0,1).equals("9")){
				first = "nine";
				x=9;
			}
			if(time.substring(2,4).equals("15")){
				second = "quarter past ";
			}else if(time.substring(2,4).equals("30")){
				second = "half past ";
			}else if(time.substring(2,4).equals("45")){
				second = "quarter til ";
				x= x+1;
				third = second + x;
				return third;
			}else{
				second = time.substring(2,4)+" minutes past ";
			}
			
			
			if(time.substring(2,4).equals("00")){
				second = " o'clock";
				third = first+second;
			}else{
				third = second+first;	
				}
			}
		if(time.equals("4:20")){
			System.out.println("ASUH DUDE");
		}
		if(time.length()==5){
			if(time.substring(0,2).equals("10")){
				first = "ten";
				x=10;
			}
			if(time.substring(0,2).equals("11")){
				first = "eleven";
				x=11;
			}
			if(time.substring(0,2).equals("12")){
				first = "twelve";
				x=12;
			}
		
			
			if(time.substring(3,5).equals("15")){
				second = "quarter past ";
			}else if(time.substring(3,5).equals("30")){
				second = "half past ";
			}else if(time.substring(3,5).equals("45")){
				second = "quarter til ";
				x=x+1;
				if(x==13){
					x=1;
				}
				third = second + x;
				return third;
			}else{
				second = time.substring(3,5)+" minutes past ";
			}
			
			
			if(time.substring(3,5).equals("00")){
				second = " o'clock";
				third = first+second;
			}else{
				third = second+first;	
			}
		}
		return third;
	}
}
