//find index of largest element<=k in a sorted array
int floorIdx(int a[], int k){
    int l = 0;
    int r = a.length - 1;
    int ans = -1;
    while(l <= r){
        int m = l + (r - l) / 2;
        if(a[m] <= k){
            ans = m;
            l = m + 1;
        }
        else{
            r = m - 1;
        }
    }
    return ans;
}
//Time: O(logn)
