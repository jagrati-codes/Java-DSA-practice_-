public class Transpose {
    static int[][] transpose(int [][] arr){                          //TC=O(m*n)             SC=O(m*n)
    int [][] ans =new int [arr[0].length][arr.length];           /*yaha par rows ki capacity aur column ki capacity interchange karke likhi hai
                                                                   taki square matrix ke saath rectangular matrix ka bhi kaam ho jaye*/
    for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
            if(row!=col){
               ans[row][col]=arr[col][row]; 
        }else{ans[row][col]=arr[row][col];
        }}
    }return ans;
}
}
