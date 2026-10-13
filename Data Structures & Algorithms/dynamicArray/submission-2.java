class DynamicArray {
    int length;
    int capacity;
    int[] arr;

    public DynamicArray(int capacity) {
        this.length = 0;
        this.capacity = capacity;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (this.length == this.capacity)
            resize();
        arr[length] = n;
        length++;

    }

    public int popback() {
        length--;
        return arr[length];
        

    }

    private void resize() {
        this.capacity *= 2;
        int[] newArr = new int[capacity];

        for (int i = 0; i <length; i++)
        {
            newArr[i] = arr[i];
        }

        this.arr = newArr;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
