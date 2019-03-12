package genericsHW;

import java.util.ArrayList;
import java.util.List;

public class CollectionMedium <P extends Medium> {
    private List<P> setMedium = new ArrayList<>();

    public void setSetMedium(P setMedium) {
        this.setMedium.add(setMedium);
    }

    public String toString(){
        return setMedium.toString();
    }
}
