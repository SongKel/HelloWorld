package co.edu.condition;

public class IfExample3 {
    public static void main(String[] args) {
		//중첩구문.
    	// 90점이상...A, 80점이상...B, 70점이상...C,그외 F
    	// 90점이상 95=>A+, 80점이상 85=>B+
    	int score = 88;
    	if(score >= 90) {
    		if(score >= 95) {
    			System.out.println("A+학점.");
    		}else {
    			System.out.println("A학점.");	
    		}   		
            if(score >= 85) {   	
            	System.out.println("B+학점.");
    	}else if (score >= 80) {
    			System.out.println("B학점.");    		
    	} 
    	}
    }
}


