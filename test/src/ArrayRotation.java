public class ArrayRotation {

    int findPivotElement(int[] array, int x, int n)
    {
       int pivot = findPivot(array,0,n-1);
       if(array[pivot] == x)
           return pivot;
       if(array[0] <= x) {
           return binarySearch(array, 0, pivot - 1, x);
       }
       return binarySearch(array,pivot+1,n-1,x);

    }
// we can do findpivot using o(n) or o(logn)
   int findPivot(int[] array, int low, int high){
if(low>high)
    return -1;
if(low == high)
    return array[low];
int mid = low+high/2;
if(mid<high && array[mid]> array[mid+1])
    return mid;
 if (low<mid && array[mid] < array[mid-1])
    return mid-1;
 if(array[low]>=array[mid])
     return findPivot(array,low,mid-1);
 else
     return findPivot(array,mid+1,high);

}
 int binarySearch(int[] array, int low, int high, int x){
     if (high < low)
         return -1;

     /* low + (high - low)/2; */
     int mid = (low + high)/2;
     if (x == array[mid])
         return mid;
     if (x > array[mid])
         return binarySearch(array, (mid + 1), high, x);
     return binarySearch(array, low, (mid -1), x);
 }

}



