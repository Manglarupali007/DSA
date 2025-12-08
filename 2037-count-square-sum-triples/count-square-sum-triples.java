class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                // long sqr=1L*(i*i)+1L*(j*j);
                long sqr=(i*i)+(j*j); 
                double root=Math.sqrt(sqr);
                int k=(int)root;
                if(k*k==sqr && k<=n){
                    count++;
                }
            }
        }
        return count;
    }
}