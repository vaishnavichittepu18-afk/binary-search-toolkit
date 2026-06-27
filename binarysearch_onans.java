//array contains n books and a[i] is no.of pages in ith book.A student can read only contiguous book.
//Find the minimum value of maximum pages a student has to read to complete reading all the books.
int minofmax(int a[],int students)
    int l=0,r=0,ans = -1;
    for(int x: a){
        l=Math.max(l,x);
        r+=x;
    }

    //master template follows the following while loop for all problems based on, doing binary search on answer 
    while(l <= r){
        int m = l + (r - l) / 2;
        if(isPossible(m)){
            ans = m;
            r = m - 1;
        }
        else{
            l = m + 1;
        }
    }
    return ans;
}
boolean isPossible(int a[], int students, int limit){
    int count = 1;
    int pages = 0;
    for(int x : a){
        if(x > limit)
            return false;
        if(pages + x <= limit){
            pages += x;
        }
        else{
            count++;
            pages = x;
        }
    }
    return count <= students;
}
//isPosssible() changes according to the question 
/*example : find the minimum speed required to finish all boxes within h hours 
boolean isPossible(int boxes[], int h, int speed){
    long hours = 0;
    for(int x : boxes){
        hours += (x + speed - 1) / speed;
    }
    return hours <= h;
}*/
//Problems : 
/*1. Minimum Days to Make M Bouquets
   Find the minimum number of days needed to make M bouquets,
   where each bouquet requires K adjacent flowers.

2. Capacity to Ship Packages Within D Days
   Find the minimum ship capacity needed to deliver all packages within D days.

3. Aggressive Cows
   Place cows in stalls such that the minimum distance between any two cows is maximum.

4. Book Allocation
   Allocate books to students such that the maximum pages assigned to a student is minimum.

5. Split Array Largest Sum
   Split the array into K subarrays such that the largest subarray sum is minimum.
*/
