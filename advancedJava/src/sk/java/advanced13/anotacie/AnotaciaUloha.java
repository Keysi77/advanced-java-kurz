package sk.java.advanced13.anotacie;

public @interface AnotaciaUloha {
    String autor();
    String date();
    int currentRevision();
    String lastModified();
    String lastModifiedBy();
    String[] reviewers();
}
