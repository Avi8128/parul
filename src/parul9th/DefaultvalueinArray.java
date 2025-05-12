package parul9th;

public class DefaultvalueinArray {

	private static final int i = 0;

	public static void main(String[] args) {
  		int[] arr = new int[5];
		for (int i=0;i<=3;i++);
		   arr[i]=10;
		System.out.println("int default ::"+arr[4]);
	// 	arr[5]=20;
		// TODO Auto-generated method stub
		char[] charArr= new char[5];
		for(int i=0;i<=charArr.length-2;i++);
		charArr[i]='A';
		System.out.println("char default::"+charArr[4]);
		
		  double[] doubleArr = new double[5];

	        for (int i = 0; i <= doubleArr.length - 2; i++) {
	            doubleArr[i] = 1.5;
	        }

	        System.out.println("double default::" + doubleArr[4]);
	        

	}

}
