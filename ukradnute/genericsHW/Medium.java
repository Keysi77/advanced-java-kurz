package genericsHW;

public class Medium extends Library{
       private String name;
       private String interpret;
       private int releaseYear;

    public Medium(String name, String interpret, int releaseYear) {
        this.name = name;
        this.interpret = interpret;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Medium{" +
                "name='" + name + '\'' +
                ", interpret='" + interpret + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
