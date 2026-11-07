import java.util.List;

public class RecursionQ1 {
    static void getAllSubsequences(String s, int index, StringBuilder output,List<String> ans){
    if(index>=s.length()){
        String subsequence =output.toString();
        ans.add(subsequence);
        return;
    }//include exclude pattern 
    char ch=s.charAt(index);
    //include
    output.append(ch);
    getAllSubsequences(s, index+1, output, ans);
    //exclude
    output.deleteCharAt(output.length()-1);
    getAllSubsequences(s, index+1, output, ans);
}

}
