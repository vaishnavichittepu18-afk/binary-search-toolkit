//finding square root of real numbers
double sqrt(double n) {
    double l = 0, r = n;
    double eps = 1e-6;
    while (r - l > eps) {
        double mid = l + (r - l) / 2;
        if (mid * mid < n)
            l = mid;
        else
            r = mid;
    }
    return l;
}
//Time: O(logn)
//for finding square root of real number upto 3 decimal places change eps to 0.0001
