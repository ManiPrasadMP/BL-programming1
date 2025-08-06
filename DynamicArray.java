package objectOriented;

public class DynamicArray {
	
	 private int[] data;
	    private int size;

	    public DynamicArray() {
	        data = new int[5]; // initial size
	        size = 0;
	    }

	    public void add(int element) {
	        if (size == data.length) {
	            resize();
	        }
	        data[size++] = element;
	    }

	    public int get(int index) {
	        if (index >= 0 && index < size) return data[index];
	        throw new IndexOutOfBoundsException("Index " + index);
	    }

	    public int size() {
	        return size;
	    }

	    private void resize() {
	        int[] newData = new int[data.length * 2];
	        for (int i = 0; i < data.length; i++) {
	            newData[i] = data[i];
	        }
	        data = newData;
	    }

	    public static void main(String[] args) {
	        DynamicArray arr = new DynamicArray();
	        arr.add(10);
	        arr.add(20);
	        arr.add(30);
	        arr.add(40);
	        arr.add(50);
	        
	        System.out.println(arr.get(3));
	        for(int i= 0;i<arr.size;i++)
	        	System.out.println(arr.get(i));
}
}
