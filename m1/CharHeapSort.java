class CharHeapSort {

    // tree data structure
    // i: arr of char
    // o: arr in asc order
    // O(nlogn) time b/c building heap is o(n) + sorting is o(nlogn)
    // o(1) space b/c in-place sort, constant space
    public void executeSort(char[] values) {
        int size = values.length;

        for (int i = size / 2 - 1; i >= 0; i--)
            adjustHeap(values, size, i);

        for (int i = size - 1; i >= 1; i--) {
            char tempChar = values[0];
            values[0] = values[i];
            values[i] = tempChar;

            adjustHeap(values, i, 0);
        }
    }

    private void adjustHeap(char[] values, int size, int root) {
        int maxPosition = root;
        int leftChildPos = 2 * root + 1;
        int rightChildPos = 2 * root + 2;

        if (leftChildPos < size && values[leftChildPos] > values[maxPosition])
            maxPosition = leftChildPos;

        if (rightChildPos < size && values[rightChildPos] > values[maxPosition])
            maxPosition = rightChildPos;

        if (maxPosition != root) {
            char swapChar = values[root];
            values[root] = values[maxPosition];
            values[maxPosition] = swapChar;

            adjustHeap(values, size, maxPosition);
        }
    }


}
