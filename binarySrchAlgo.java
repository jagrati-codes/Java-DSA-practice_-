public class binarySrchAlgo {
    
    static int binarySrch(int [] arr, int target){                                      //TC=O(log n)
        int st=0;
        int end=arr.length-1;
       // int mid=(st+end)/2;                               es se integer overflow ho sakta hai
        int mid=st+(end-st)/2;                              

        while(st<=end){
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;                      //end index update
            }
            else{
                st=mid+1;                       //start index update
            } mid=st+(end-st)/2;
                                    //dont forget to update the mid index as well
        }
        //agar yaha tak aa gaye hai ,while ke bahar toh it means target is not present 
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,8};
        System.out.println(binarySrch(arr, 7));
    }
}


