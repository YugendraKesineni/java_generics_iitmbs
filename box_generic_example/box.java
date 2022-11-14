import java.util.*;

public class box<T> {
    private List<T> items;

    public box(){
        this.items = new ArrayList<>();
    }

    public List<T> getItems(){
        return items;
    }
}