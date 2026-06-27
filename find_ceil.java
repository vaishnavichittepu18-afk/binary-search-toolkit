//find index of smallest element>=k 
int ceilIdx(int a[], int k){
    int l = 0;
    int r = a.length - 1;
    int ans = -1;
    while(l <= r){
        int m = l + (r - l) / 2;
        if(a[m] >= k){
            ans = m;
            r = m - 1;
        }
        else{
            l = m + 1;
        }
    }
    return ans;
}
//Time: O(logn)
