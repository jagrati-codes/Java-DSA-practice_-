public class BinarySrch{

//Q-pivot index in sorted rotated array
    static int pivotIndex(int [] crr){
        int n= crr.length;
        int st=0;
        int end=n-1;
        int ans=0;

        if(crr[st]<crr[end]){                   //ye us case ke liye jab array rotate hi na hua ho
            return -1;
        }else{
            for(int i=0;i<n;i++){
              int mid=st+(end-st)/2;                 //ek l1(jisme saare elements last element se chote) aur dusra l2(jisme uss last element se bade)
             if(crr[mid]<=crr[n-1]){                    //unko alag karenge
                end=mid-1;
            }
             else{
              ans=mid;
              st=mid+1;  
            }
        }return ans;}
    }
    
    public static void main(){
        int [] arr={7,8,9,2,3,4};
        System.out.println(pivotIndex(arr));
        }

}

