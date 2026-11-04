import java.util.ArrayList;
import java.util.List;

//to return list of elements in spiral order

public class spiral_2D_array {
    static List<Integer> spiralOrder(int[][] brr){
        List<Integer> lst =new ArrayList<>();
        int n=brr.length;
        int m=brr[0].length;
        int startingRow= 0;
        int endingRow= n-1;
        int startingCol =0;
        int endingCol=m-1;

        while(startingRow<=endingRow && startingCol<=endingCol){
// first: stcol-->endcol then strow-->endrow then endcol-->stcol then endrow-->strow then repeat    
            for(int col=startingCol;col<=endingCol;col++){
                lst.add(brr[startingRow][col]);
            }startingRow++;
            for(int row=startingRow;row<=endingRow;row++){
                lst.add(brr[row][endingCol]);  
            }endingCol--;

            if(startingRow<=endingRow){                                 //valid startingRow hai ya nahi
            for(int col=endingCol;col>=startingCol;col--){
                lst.add(brr[endingRow][col]);}
            }endingRow--;

            if(startingCol<=endingCol){                             //valid startingCol hai ya nahi
            for(int row=endingRow;row>=startingRow;row--){
                lst.add(brr[row][startingCol]);}
            }startingCol++;
            
        }
        return lst;
}}
