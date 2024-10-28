package October_2024._25102024_Arrays;

import java.util.Scanner;

public class ArrayEx12_BubbleSort {
    public static void main(String[] args) {

        System.out.println("Enter how many elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b[] = new int[n];

        //accept elements to the array
        System.out.println("Enter elements");
        for (int i=0 ; i<n ; i++)
        {
            b[i] = sc.nextInt();
        }

        System.out.println("Entered elements");
        for (int i=0 ; i<n ; i++)
        {
            System.out.println(b[i]);
        }

        //Use bubble sort tech to sort elements
        int temp;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(b[j]>b[j+1])
                {
                    temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting elements");
        for (int i=0 ; i<n ; i++)
        {
            System.out.println(b[i]);
        }

    }
}
/*
Explanation of Each Part
Outer Loop (for (int i = 0; i < n - 1; i++)):

This loop controls the number of passes through the array.
Each pass places the next largest element in its correct position from the end of the array.
We go up to n - 1 passes because, after each pass, the largest unsorted element "bubbles up"
to the correct position.
So, after n - 1 passes, the entire array will be sorted.
Inner Loop (for (int j = 0; j < n - i - 1; j++)):

This loop performs the comparison of adjacent elements and, if needed, swaps them.
It iterates up to n - i - 1 because, after each outer pass, the last i elements are already
in sorted order.
As i increases, the range that needs to be checked decreases, making the algorithm more
efficient.
Comparison and Swap (if (b[j] > b[j + 1])):

Inside the inner loop, we check if the current element b[j] is greater than the next element
b[j + 1].
If it is, we perform a swap to place the larger element in the higher index (b[j + 1]),
effectively "bubbling" it up towards the end of the array.
This swap involves temporarily storing the value of b[j] in temp, moving b[j + 1] to b[j],
and then assigning temp to b[j + 1].
Example Walkthrough
Let’s say we have an array b = {5, 3, 8, 4, 2}, and n = 5 (length of b).

First Pass (i = 0):

Comparisons:
j = 0: Compare 5 and 3. Since 5 > 3, swap them. b becomes {3, 5, 8, 4, 2}.
j = 1: Compare 5 and 8. No swap needed.
j = 2: Compare 8 and 4. Since 8 > 4, swap them. b becomes {3, 5, 4, 8, 2}.
j = 3: Compare 8 and 2. Since 8 > 2, swap them. b becomes {3, 5, 4, 2, 8}.
The largest element, 8, has "bubbled up" to the end.
Second Pass (i = 1):

Comparisons:
j = 0: Compare 3 and 5. No swap needed.
j = 1: Compare 5 and 4. Since 5 > 4, swap them. b becomes {3, 4, 5, 2, 8}.
j = 2: Compare 5 and 2. Since 5 > 2, swap them. b becomes {3, 4, 2, 5, 8}.
The second largest element, 5, has moved to its correct position.
Subsequent Passes:

Continue similarly, moving each largest remaining element to its position at the end.
After all passes, the array will be sorted as {2, 3, 4, 5, 8}.
 */