package parul8th;

public class SingleArray {

	public static void main(String[] args) {
//		
//		 Object[] mixedArray = { true, 100, 'Z' };
//
//	        // Printing values and their types
//	        for (Object item : mixedArray) {
//	            System.out.println("Value: " + item + ", Type: " + item.getClass().getSimpleName());
//
//	}
//
//		 int[] arr = new int[5];
//		 
//		 for (int i=0;i<arr.length;i++)
//			 
//			 arr[i]=10;
//		 
//		 for(int i=0;i<arr.length;i++)
//			 System.out.println("value::"+arr[i]);
//		 //initaization
//		 int [] initaizationArr= {10,20,30};
//		 for(int i=0;i<initaizationArr.length;i++)
//			 System.out.println("InitializationArr value: " + initaizationArr[i]);
//		
//		int[] numbers = {99, 1, 24, 65, 12457, 88, 97, 1456};
//
//        System.out.println("Numbers starting with an even digit:");
//        for (int num : numbers) {
//            int firstDigit = getFirstDigit(num);
//            if (firstDigit % 2 == 0) {
//                System.out.println(num);
//            }
//        }
//    }
//
//    private static int getFirstDigit(int num) {
//        num = Math.abs(num); 
//        while (num >= 10) {
//            num /= 10;
//        }
//        return num;
		
		  int[] numbers = {99, 1, 24, 65, 12457, 88, 97, 1456, 56}; 
	        int length = numbers.length;

	        if (length == 0) {
	            System.out.println("Array is empty.");
	        } else if (length % 2 == 1) {
	           
	            int middleIndex = length / 2;
	            System.out.println("Middle number: " + numbers[middleIndex]);
	        } else {
	           
	            int middle1 = length / 2 - 1;
	            int middle2 = length / 2;
	            System.out.println("Middle numbers: " + numbers[middle1] + ", " + numbers[middle2]);
	        
	
    }
}
}