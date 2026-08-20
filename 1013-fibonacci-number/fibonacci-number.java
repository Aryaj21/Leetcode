class Solution {

    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int last=0;
        int slast=1;
        int cur=0;
        if(n>=2){
            for(int i=2;i<=n;i++){
                cur=last+slast;
                last=slast;
                slast=cur;
            }
        }
        return cur;
    }
}