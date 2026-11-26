import java.util.Arrays;

public class medianOfTwoArray {
    //this is ques 4 on leetcode : FIND MEDIAN OF SORTED ARRAYS (HARD)

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] mergeArray=new int[nums1.length+nums2.length];
        double ans=0;
        for(int i=0;i<nums1.length;i++){
            mergeArray[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            mergeArray[nums1.length+i]=nums2[i];
        }

        Arrays.sort(mergeArray);   

        int n= mergeArray.length/2;
    if(n<=0){
     return mergeArray[n];
    }
        if(mergeArray.length%2!=0){
            ans=(double)(mergeArray[n]);
        }
        else{
            ans=(double)(mergeArray[n-1]+mergeArray[n])/2;
        }
   return ans;
        }
}
