import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
     static void helper(int n,int l, int r, List<String> ans,String s){
            if(r==n){
                ans.add(s);
                return ;
            }
            if(l>r){
                helper(n,l,r+1,ans,s+")");
            }
            if(l<n){
                helper(n,l+1,r,ans,s+"(");
            }
        }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(n,0,0,ans,"");
        return ans;
    }
}
