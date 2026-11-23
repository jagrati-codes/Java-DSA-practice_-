public class leetcdQ287 {
    //using floyd's cycle detection (as ques says to use only constant space otherwise this can easily be done using HashMap)
    public int findDuplicate(int[] nums) {
        //Phase 1:detect cycle
     int s=0;
     int f=s;
     do{
        s=nums[s];
        f=nums[nums[f]];
     }while(s!=f);

     //Phase 2: Find cycle entrance 
     f=0;
     while(s!=f){
        s=nums[s];
        f=nums[f];
     }
     return s;
    }
}
