package MyCollections;

public class QueueImpl implements IQueue{
    private Object[] data;

    private int capasity = 10;
    private int len = 0;

    public QueueImpl(){
        data = new Object[capasity];
    }

    public Object pop(){
        if(len == 0){
            return null;
        }
        Object elemToReturn = data[0];
        for(int i = 0; i < len-1; i++){
            data[i] = data[i+1];
        }
        data[len-1] = null;
        len-=1;
        return elemToReturn;
    }

    public void push(Object o){
        if(len == capasity){
            capasity += capasity/2;
            Object[] newArr = new Object[capasity];
            System.arraycopy(data, 0, newArr, 0, len);
            data = newArr;
        }
        data[len] = o;
        len++;
    }

    public int len(){
        return len;
    }
}
