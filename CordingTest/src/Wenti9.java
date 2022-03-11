
public class Wenti9 {
	
	    public static void main(String[] args) {
	        int[] s={1, 3, 4, 8, 13, 17, 20,};
	        System.out.println(findMinDist(s));
	    }
	    private static String findMinDist(int[] input) {
	        int mVal = 0;
	        String result = null;
	        for(int i=0;i<input.length-1;i++){
	            int tempVal = input[i+1] - input[i]; 
	            if(result != null){
	                if(tempVal < mVal){
	                    mVal = tempVal; 
	                    result = "(" + input[i] + "," + input[i+1] +")";
	                }
	            }else{
	                mVal = tempVal; 
	                result = "(" + input[i] + "," + input[i+1] +")";
	            }
	        }
	        return result;
	    }
}
