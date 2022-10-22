package sorting;
import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array:");
            int n = sc.nextInt();
            System.out.println("Enter array element:");
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            System.out.println("The sorted array is:");
            mergesort(a, 0, n-1);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }

    private static void mergesort(int[] a, int l, int r) {
        int mid = l + (r-l)/2;
        if(l == r) return;
        mergesort(a,l,mid);
        mergesort(a,mid+1,r);
        merge(a,l,mid,r);
    }

    private static void merge(int[] a, int l, int mid, int r) {
        int[] temp = new int[r-l+1];
        int i = l, j = mid+1, x = 0;
        while( i <= mid && j <= r) {
            if(a[i] < a[j]) {
                temp[x++] = a[i++];
            } else {
                temp[x++] = a[j++];
            }
        }
        while(i <= mid) {
            temp[x++] = a[i++];
        }
        while(j <= r) {
            temp[x++] = a[j++];
        }

        for(int t1 = 0, t2 = l; t1< temp.length; t1++, t2++) {
            a[t2] = temp[t1];
        }
    }

}