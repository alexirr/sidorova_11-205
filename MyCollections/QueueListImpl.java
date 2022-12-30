package MyCollections;

import java.util.ArrayList;

public class QueueListImpl implements IQueue{

    private ArrayList data;

    public QueueListImpl(){
        data = new ArrayList<>();
    }

    @Override
    public Object pop() {
        if (data.size() == 0) {
            return null;
        }
        Object returnedElem = data.get(0);
        for(int i = 0; i < data.size()-1; i++){
            data.set(i, data.get(i+1));
        }
        data.remove(data.size()-1);
        return returnedElem;
    }

    @Override
    public void push(Object o) {
        data.add(o);
    }

    @Override
    public int len() {
        return data.size();
    }
}
