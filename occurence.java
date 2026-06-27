//finding the first occurence of an element in sorted array having duplicates
int firstIdx(int a[], int k){
    int l = 0;
    int r = a.length - 1;
    int ans = -1;
    while(l <= r){
        int m = l + (r - l) / 2;//to avoid integer overflow 
        if(a[m] == k){
            ans = m;
            r = m - 1;
        }
        else if(a[m] > k)
            r = m - 1;
        else
            l = m + 1;
    }
    return ans;
}
//Time: O(logn)
//for finding last occurence (replace r=m-1 with l=m+1 when match is found)
//for finding frequency of an element (get firstIdx and lastIdx and subtract) 
