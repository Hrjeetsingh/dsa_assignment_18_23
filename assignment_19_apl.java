//Trace the quick sort algorithm for input : {2,3,1}



import java.util.Arrays;

class quickSortDemo {

    public static void main(String[] args) {
              
        int a[] = { 2, 3, 1 };  
        int start = 0;
        int end = a.length - 1; 
        System.out.println("Before Sort : " + Arrays.toString(a));
        quickSort(a, start, end);
        System.out.println("After Sort : " + Arrays.toString(a));
    }
    private static void quickSort(int[] a, int start, int end) {
        if (start < end) {
                int pI = partiton(a, start, end);
                quickSort(a, start, pI - 1);
                quickSort(a, pI + 1, end);
        }
    }
    private static int partiton(int[] a, int start, int end) {      
        int pI = start;
        for (int j = start; j < end; j++) {
                if (a[j] <= a[end]) 
                {
                   
                   int temp = a[j];
                   a[j] = a[pI];
                   a[pI] = temp;
                   pI++;
                }
        }
        int temp = a[pI];
        a[pI] = a[end];
        a[end] = temp;
        return pI;
    }

}

/*           ------------------  LOGIC -----------------------
2 3 1
n=number of element ie: 3
devid  (n+1)/2            3+1=4 and 4/2=2  element

arr[2,3]            arr2[1]
merge it   [1,2,3]  sort  with conditions

*/
