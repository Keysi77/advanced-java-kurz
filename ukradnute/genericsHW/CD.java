package genericsHW;

public class CD extends Medium {
    private boolean rewrite;
    public CD(String name, String interpret, int releaseYear,boolean rewrite) {
        super(name, interpret, releaseYear);
    }

    @Override
    public String toString() {
        return  "CD{" +
                "name='" + getName() + '\'' +
                ", interpret='" + getInterpret() + '\'' +
                ", releaseYear=" + getReleaseYear()+
                ", rewrite=" + rewrite +
                '}';
    }
}
