package pac;

public class app2 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int arr[][]={
		   {10,11},
		   {12,13},
		   {13,14},
		   {14,15},
		};
		while (true) {

        Thread.sleep(1000);
        System.out.println("一秒过去了");
        int rdm=(int)(Math.random()*10%4);
        System.out.println(arr[rdm][0]+","+arr[rdm][1]);
			
		}

	}

}
