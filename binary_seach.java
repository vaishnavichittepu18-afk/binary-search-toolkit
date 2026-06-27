int findIdx(int a[], int k){
    int l = 0;
    int r = a.length - 1;
    while(l <= r){
        int m = l + (r - l) / 2;
        if(a[m] == k)
            return m;
        else if(a[m] > k)
            r = m - 1;
        else
            l = m + 1;
    }
    return -1;
}
//Time: O(log n)
//Space: O(1)
//Problems: 
//1)finding index, 2)finding index ,if no such element then return its position after insertion(return l instead of returning -1)
