package ch15_Sorting;

public class Sorting {
    int A[];

    public Sorting(int B[]) {
        A = B;
    }

    // [알고리즘 9-1] 구현: 선택 정렴
    public void selectionSort() {
        int k;
        int tmp;
        for (int last = A.length - 1; last >= 1; last--) {
            k = theLargest(last); // A[0... Last] 중 가장 큰 수 ALk] 찾기
            tmp = A[k];
            A[k] = A[last];
            A[last] = tmp;
            printArray(A);
        }
    }

    private int theLargest(int last) {
        // A[O...last]에서 가장 큰 수의 인덱스를 리턴한다.
        int largest = 0;
        for (int i = 0; i <= last; i++) {
            if (A[i] > A[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    private void printArray(int A[]) {
        System.out.print(">>> ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    } // 코드 9-1
}
