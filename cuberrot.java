long cubeRoot(long n){
    long l = 0;
    long r = 1000000;//0<=n<=10^18(since n is long) ,so if r=n overflow may occur and max possible cuberoot=cuberroot(10^18)=10^6
    while(l <= r){
        long m = l + (r - l) / 2;
        long val = m * m * m;
        if(val == n)
            return m;
        else if(val < n)
            l = m + 1;
        else
            r = m - 1;
    }
    return -1;
}
//Time: O(logn)
//finding square root (replace r=n since for maximum n value m=10^9 then m*m does not overflow and change val=m*m)
