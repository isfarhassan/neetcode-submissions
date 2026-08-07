class DynamicArray {

    private int capacity = 0;
    private int size = 0;
    private int array[];

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity)
        {
            this.resize();
        }
        array[size] = n;
        size++;
    }

    public int popback() {
        int last_element = array[size - 1];
        array[size - 1] = 0;
        size--;
        return last_element;
    }

    private void resize() {
        capacity = this.capacity * 2;
        int[] newArray = new int[capacity];

        for(int i = 0; i < size; i++ )
        {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
