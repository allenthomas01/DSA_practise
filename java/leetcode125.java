class Solution {
    public boolean isPalindrome(String s) {
                 s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }

        }
       

        for(int i=0,j=sb.length()-1;i<=j;i++,j--){
            if(sb.charAt(i)!=sb.charAt(j)){

               return false;
            }
        }
        return true;
    }
}