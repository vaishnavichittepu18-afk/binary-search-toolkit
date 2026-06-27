//find index of given element in rotated sorted array i.e., a sorted array is shifted some number of positions 
int search(int a[], int k){
    int l = 0;
    int r = a.length - 1;
    while(l <= r){
        int m = l + (r - l) / 2;
        if(a[m] == k)
            return m;
        if(a[l] <= a[m]){
            if(k >= a[l] && k < a[m])
                r = m - 1;
            else
                l = m + 1;
        }
        else{
            if(k > a[m] && k <= a[r])
                l = m + 1;
            else
                r = m - 1;
        }
    }
    return -1;
}
//Time: O(logn)
//
