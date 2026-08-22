class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum = 0;
        int mux = 1;
        while(n!=0){
            int a = n%10;
            sum = sum + a;
            mux = mux*a;
            n = n/10;
        }
        if(original % (sum+mux)==0){
           return true;
        }
        else{
            return false;
        }
        
    }

}