package LowArray;

public class lowArray {
    private long [] a;          // ref to array a

    public lowArray(int size){         // constructor
        a = new long[size];
    }

    public void setElem(int index, long value){
        a[index] = value;
    }

    public long getElem(int index){
        return a[index];
    }
}
