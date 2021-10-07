package Iterative_Search;



class BinarySearchIter {
    // Returns index of x if it is present in arr[],
    // else return -1
    static int counter = 0;


    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
  
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
  
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
  
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
  
        // if we reach here, then element was
        // not present
        return -1;
    }
  
    // Driver method to test above
    public static void main(String args[])
    {   
        BinarySearchIter ob = new BinarySearchIter();
        int arr[] = arrSearch(100);
        giveArr(arr);
        int n = arr.length;
        int x = 10; //starting number 
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                               + "index " + result);
    }


    public static int[] arrSearch(int yeet){
    int arr[] = new int[yeet];
    for(int i = 0; i < arr.length; i++){
        arr[i] = i +1;
    }
    return arr; 
    }

    public static void giveArr(int[] arr2){
        for(int i = 0; i < arr2.length; i++ ) {
            System.out.println(arr2[i]);
        }
        
    }
}