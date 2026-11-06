public class BinarySrch_Sqrt {
    static int sqrtusingBinarySrch(int a){        //this method gives the nearest answer only not exact one
        int st=1;
        int end=a;
        int ans=0;
        
        if(st==0){                      //yaha par 0 vala case handle ho raha hai
            return 0;
        }
        while(st<=end){
            int mid=st+(end-st)/2;
            if(mid==a/mid){                         //mid*mid==a karte toh integer overflow ho sakta hai
                return mid;                         //par divide by 0 case ayega
            }else if(mid>a/mid){
                end=mid-1;
            }else{
                ans=mid;
                st=mid+1;
            }
        }return ans;
    }
}
