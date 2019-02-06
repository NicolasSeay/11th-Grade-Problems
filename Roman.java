import java.util.Scanner;

public class Roman {
	
	public static int value(char r){
		int number = 0;
		if(r=='I')
			number = 1;
		if(r=='V')
			number = 5;
		if(r=='X')
			number = 10;
		if(r=='L')
			number = 50;
		if(r=='C')
			number = 100;
		if(r=='D')
			number = 500;
		if(r=='M')
			number = 1000;
		return number;
	}
	
	public static int romanToDecimal(String str){
		int total = 0;									//final decimal value of str
		char[] x = str.toCharArray();					//STRING TO CHAR
		
		for(int a=0; a<=str.length()-1; a++){
			int current = value(x[a]);
			if(a == str.length()-1){
				total += current;
			}
			else{
				if((current >= value(x[a+1])) || (a == str.length()-1)){
					total += current;
				}
				else{
					total -= current;
					total += value(x[a+1]);
					a=a+1;
				}
			}
			
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<4; i++){
            System.out.print("Enter Roman numerals: ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
		
			System.out.println(romanToDecimal(input));
		}
	}

}
