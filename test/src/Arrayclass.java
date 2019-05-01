//Find the element that appears once in a sorted array
// where all other elements appear twice one after another. Find that element in 0(n) complexity.

public class Arrayclass {

    public static int search(int[] array, int a, int b) {
        for (int i = 0; i < b - 1; i += 2) {
            if (array[i] != array[i + 1]) {
                return array[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr ={ 4, 6, 7,1,2};
        int x = 1;
        /*int result = search(arr, 0, arr.length-1);
        if(result == 0)
        {
            System.out.println("No such element exists");
        }
        else
            System.out.println("element is " + result);
    }*/
        ArrayRotation ar = new ArrayRotation();
        int pivot = ar.findPivotElement(arr,x,arr.length-1);
        System.out.println("element is " + pivot);
    }
}
