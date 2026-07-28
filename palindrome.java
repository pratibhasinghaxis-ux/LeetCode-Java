class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        
        int original = x;
        int sum = 0;
        while(x!=0){
            int a = x%10;
            sum = (sum*10)+a;
            x = x/10;
        }
        return sum==original;
       
    }
    
    
}