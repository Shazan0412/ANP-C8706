package jul8;

	public class Dem {
	    public static void main(String[] args) {
	        int[] arr = {2, 3, 5, 8, 7, 6};

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] + arr[j] == 12) {
	                    System.out.println("Two numbers whose sum is 12 are: " + arr[i] + " and " + arr[j]);
	                }
	            }
	        }
	    }
	}

