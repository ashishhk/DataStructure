import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Solution sol = new Solution();
		//sol.plusOne(new ArrayList<Integer>(Arrays.asList( -2, 1, -3, 4, -1, 2, 1, -5, 4)));
		sol.maxSubArray(new int [] {-2, 1, -3, 4, -1, 2, 1, -5, 4});
		
	}

}


class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int i=0;
        int largestSum=Integer.MIN_VALUE;
        if(A.length==1){
            return A[0];
        }
        int prevSum = 0;
        while(i<A.length){
            int sum=0;
            int checkPointSum=0;
            for(int j=i;j<A.length;j++){
              sum+=A[j];
              if(j==i|| checkPointSum<sum){
            	  checkPointSum=sum;
            	  if(i>0 && checkPointSum>prevSum-A[j-1]){
            	      break;
            	  }
              }
            }
            prevSum=sum;
            if(largestSum<checkPointSum){
                largestSum=checkPointSum;
            }
            i++;
        }
        return largestSum;
    }
}


