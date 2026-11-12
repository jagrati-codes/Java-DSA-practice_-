public class KadaneAlgo {
    //  KADANE'S ALGORITHM
    //ek array ka esa subarray jiska sum max ho us max val ko find karne ke liye is algo ka use karte hai
    
    static int maxsumofsubarray(int[] ar){
        int currentsum=ar[0];
        int maxsum=ar[0];
        for(int i=0;i<ar.length;i++){
            currentsum=Math.max(ar[i],currentsum+ar[i]);
            maxsum=Math.max(maxsum, currentsum);
          }
            return maxsum;}
}
