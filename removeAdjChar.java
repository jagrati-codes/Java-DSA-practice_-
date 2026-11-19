public class removeAdjChar {
     //remove all adj duplicates in String
    static String remAdcDup(String s){
    StringBuilder ans=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char currentChar=s.charAt(i);
        if(ans.isEmpty()){
            ans.append(currentChar);
        }else if(ans.length()>0 && ans.charAt(ans.length()-1)==currentChar){
            ans.deleteCharAt(ans.length()-1);
        }else{
            ans.append(currentChar);
        }
    }return ans.toString();
}
}
