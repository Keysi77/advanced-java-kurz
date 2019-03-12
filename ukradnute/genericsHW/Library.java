package genericsHW;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Medium> libraryList = new ArrayList<>();


    public void setLibraryList(List<Medium> libraryList) {
        this.libraryList = libraryList;
    }

    public List<Medium> getLibraryList() {
        return libraryList;
    }
}
