	/*public int[] squareEven(int[] array,int length){
		// Check for edge cases.
		if(array == null) {
			return null;
		}
		
		// Create a resultant Array which would hold the result.
		int[] result = new int[length];
		
		// Iterate through the original Array.
		for(int i=0;i<length;i++) {
			// Get the element from slot i  of the input Array.
			int element = array[i];
			
			// if the index is an even number, then we need to square element.
			if(i%2==0) {
				element*=element;
			}
			
			// Write element int the result Array.
			result[i] = element;
		}
		return result;
	}*/
	
	public int[] squareEven(int[] array,int length){
		// Check for edge cases.
		if(array == null) {
			return null;
		}
		// Iterate through the original Array.
		for(int i=0;i<length;i++) {
			// If the index is an Even number,the we need to square element and replace the original value in the Array.

			if(i%2==0) {
			 	array[i] *= array[i];
			}
		}
		return array;
	}
