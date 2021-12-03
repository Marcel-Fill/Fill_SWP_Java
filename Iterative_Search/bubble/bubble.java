package Iterative_Search.bubble;

class bubble
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        long t1 = System.nanoTime();
        bubble ob = new bubble();
        int arr[] = {83, 31, 27, 13, 26, 1, 130};
        ob.bubbleSort(arr);
        ob.printArray(arr);
        long t2 = System.nanoTime();
        System.out.println("Sorted Version took for: "+ ((t2-t1)/1000) + " mikro seks" );
    }
}