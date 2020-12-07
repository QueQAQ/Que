
public class find {

	// R_zero(x,y)=(column,row)=R_zero(1,3);

	void findZero(int array2d[][]){
		for (int row=0; row<array2d.length; row++) {
			for (int column=0; column<array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_zero("+column+","+row+")");return;
				}
			}
		}	
	}
	
	void findZero1(int array2d[][]){
		for (int row=0; row<array2d.length; row++) {
			for (int column=0; column<array2d[0].length; column++) {
				if (array2d[row][column]==10) {
					System.out.println("R_left("+column+","+row+")");return;
				}
			}
		}	
	}
	
	void findZero2(int array2d[][]){
		for (int row=0; row<array2d.length; row++) {
			for (int column=0; column<array2d[0].length; column++) {
				if (array2d[row][column]==12) {
					System.out.println("R_right("+column+","+row+")");return;
				}
			}
		}	
	}
	
	void findZero3(int array2d[][]){
		for (int row=0; row<array2d.length; row++) {
			for (int column=0; column<array2d[0].length; column++) {
				if (array2d[row][column]==5) {
					System.out.println("R_up("+column+","+row+")");return;
				}
			}
		}	
	}
	
	void findZero4(int array2d[][]){
		for (int row=0; row<array2d.length; row++) {
			for (int column=0; column<array2d[0].length; column++) {
				if (array2d[row][column]==11) {
					System.out.println("R_down("+column+","+row+")");return;
				}
			}
		}	
	}

}
