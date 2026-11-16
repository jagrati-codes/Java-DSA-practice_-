public class rotateArrayBy90 {
    static int[][] rotateAryBy90 (int [][] ary){
        int[][] ans =new int[ary[0].length][ary.length];
        
        for(int row=0;row<ary.length;row++){
            for(int col=0;col<ary[0].length;col++){
                ans[col][ary.length-1-row]=ary[row][col];
            }
        }return ans;
    }
}
