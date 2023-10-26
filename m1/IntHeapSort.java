class IntHeapSort {

    // tree data structure
    // i: arr of char
    // o: arr in asc order
    // O(nlogn) time b/c building heap is o(n) + sorting is o(nlogn)
    // o(1) space b/c in-place sort, constant space
    public void executeSort(int[] values) {
        int size = values.length;

        for (int i = size / 2 - 1; i >= 0; i--)
            adjustHeap(values, size, i);

        for (int i = size - 1; i >= 1; i--) {
            int tempValue = values[0];
            values[0] = values[i];
            values[i] = tempValue;

            adjustHeap(values, i, 0);
        }
    }

    private void adjustHeap(int[] values, int size, int root) {
        int maxIndex = root;
        int leftChild = 2 * root + 1;
        int rightChild = 2 * root + 2;

        if (leftChild < size && values[leftChild] > values[maxIndex])
            maxIndex = leftChild;

        if (rightChild < size && values[rightChild] > values[maxIndex])
            maxIndex = rightChild;

        if (maxIndex != root) {
            int swapValue = values[root];
            values[root] = values[maxIndex];
            values[maxIndex] = swapValue;

            adjustHeap(values, size, maxIndex);
        }
    }
}
