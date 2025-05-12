package com.parul.loops;

public class ContinueDemo {
	public static void main(String[] args) {
		for (int day=1;day<=2 ;day++) {
		if(day==1)
			    continue;
		    switch(day) {
		    case 1:
		    	System.out.println("week of the day::monday");
		    	break;
		    case 2:
		    	System.out.println("week of the day::tuesday");
		    	break;
		    case 3:
		    	System.out.println("week of the day::wednesday");
		    	break;
		    case 4:
		    	System.out.println("week of the day::Thursday");
		    	break;
		    case 5:
		    	System.out.println("week of the day::friday");
		    case 6:
		    	System.out.println("week of the day:: Saturday");
		    	break;
		    default :
		    	System.out.println("enjoy youtr holiday:::sunday");
		    	break;
		    }
		}
	}
}
	
//			System.out.println("week of the day::"+day);
//		} 
//		{
//		        for (int day = 1; day <= 7; day++) {
//		            switch (day) {
//		                case 7:
//		                    // Skip the 7th day (e.g., Sunday)
//		                    break;
//		                default:
//		                    System.out.println("week of the day::" + day);
//		                    break;
//		            }
//		        }
//		    
//		}
	
		
		


	
	

	

	

