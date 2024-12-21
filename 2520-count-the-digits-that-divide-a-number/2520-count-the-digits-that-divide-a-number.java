class Solution {
    public int countDigits(int num) {
        int count=0;
        for(int i=num; i>0; i=i/10){
            int temp=i%10;
            if(num%temp==0)count++;
        }
        return count;
    }
}