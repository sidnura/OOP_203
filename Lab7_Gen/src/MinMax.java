import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MinMax<Y> {
    private ArrayList<Y> arrayList = new ArrayList<>();

    MinMax(ArrayList<Y> arrayList){
        this.arrayList = arrayList;
    }
    public Integer getMin(){
        return Collections.min((Collection<? extends Integer>) arrayList);
    }
    public Integer getMax(){
        return Collections.max((Collection<? extends Integer>) arrayList);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(-1);
        arrayList.add(99);


        MinMax<Integer> array = new MinMax<>(arrayList);
        System.out.println(array.getMin());
        System.out.println(array.getMax());

    }
}