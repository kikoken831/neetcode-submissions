class DynamicArray {

    private int[] arr;
    private int capacity = 0;
    private int size = 0;

    public DynamicArray(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(size==capacity){
            this.resize();
        }
        this.arr[this.size] = n;
        this.size++;
    }

    public int popback() {
        int output = arr[size-1];
        size--;
        return output;
    }

    private void resize() {
        int[] tempArr = new int[capacity*2];
        for(int i = 0; i < size; i++){
            tempArr[i] = arr[i];
        }
        arr = tempArr;
        capacity=capacity*2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
