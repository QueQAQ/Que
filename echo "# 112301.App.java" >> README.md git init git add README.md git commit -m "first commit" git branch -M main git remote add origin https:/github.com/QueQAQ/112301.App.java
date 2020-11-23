package pac;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while (true) {
			int num=scanner.nextInt();
			if (num==1) {
				System.out.print("X("+(int) (Math.random()*100)+","+(int)(Math.random()*100)+")");
			}
			
		}
		
	}

}
