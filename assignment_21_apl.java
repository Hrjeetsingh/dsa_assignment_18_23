import java.util.*; 
//import java.lang.*; 
//import java.io.*; 


/*"1. Given two sorted arrays, the task is to merge them in a sorted manner.

Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}*/


class mergetoarray{ 
    
    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) 
    { 
        int i = 0, j = 0, k = 0; 
       
        while (i<n1 && j <n2) 
        { 
            
            if (arr1[i] < arr2[j]) 
                arr3[k++] = arr1[i++]; 
            else
                arr3[k++] = arr2[j++]; 
        } 
    
         
        while (i < n1) 
            arr3[k++] = arr1[i++]; 
    
        
        while (j < n2) 
            arr3[k++] = arr2[j++]; 
    } 
    
    public static void main (String[] args) 
    { 
        int[] arr1 = { 1, 3, 4, 5}; 
        int n1 = arr1.length; 
    
        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length; 
    
        int[] arr3 = new int[n1+n2]; 
        
        mergeArrays(arr1, arr2, n1, n2, arr3); 
    
        System.out.println("Array after merging"); 
        for (int i=0; i < n1+n2; i++){
            System.out.print(arr3[i] + " "); 
        }
    } 
} 


/*
Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8} 
Output: arr3[] = {4, 5, 7, 8, 8, 9} 1.*/

//2. In which scenario do you use linked list and arraylist?


class LL {
 
    public static void main(String[] args)
    {
        
        ArrayList<Integer> arrli= new ArrayList<Integer>();
 
        for (int i = 1; i <= 5; i++)
            arrli.add(i);
 
        System.out.println(arrli);
 
        arrli.remove(3);
 
        System.out.println(arrli);
    }
}


class AL {
    public static void main(String args[]){
 
        LinkedList<String> object= new LinkedList<String>();
        object.add("A");
        object.add("B");
        object.addLast("C");
 
        System.out.println(object);

        object.remove("B");
        object.removeFirst();
 
        System.out.println("Linked list after "+ "deletion: " + object);
    }
}

//  3. Given an array of both positive and negative integers ‘arr[]’ which are sorted. The task is to sort the square of the numbers of the Array. 
//     Time complexity: O(n) 
//     space complexity: O(n) "*/
// Java program to Sort square of the numbers
// of the array

class Complexity {
	
	public static void sortSquares(int arr[])
	{
		int n = arr.length;
	
		int k;
		for (k = 0; k < n; k++) {
			if (arr[k] >= 0)
				break;
		}

		int i = k - 1;
		int j = k; 
		int ind = 0;

		int[] temp = new int[n];
		while (i >= 0 && j < n) {
			if (arr[i] * arr[i] < arr[j] * arr[j]) {
				temp[ind] = arr[i] * arr[i];
				i--;
			}
			else {

				temp[ind] = arr[j] * arr[j];
				j++;
			}
			ind++;
		}

		while (i >= 0) {
			temp[ind++] = arr[i] * arr[i];
			i--;
		}
		while (j < n) {
			temp[ind++] = arr[j] * arr[j];
			j++;
		}

	
		for (int x = 0; x < n; x++)
			arr[x] = temp[x];
	}


	public static void main(String[] args)
	{
		int arr[] = { -6, -3, -1, 2, 4, 5 };
		int n = arr.length;

		System.out.println("Before sort ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		sortSquares(arr);
		System.out.println("");
		System.out.println("After Sort ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}


