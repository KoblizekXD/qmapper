package io.github.koblizekxd.qmapper.mappings;

public class ClassMapping {
    private final String old;
    private final String name;

    public ClassMapping(String old, String name) {
        this.old = old;
        this.name = name;
    }

    public String getOldName() {
        return old;
    }

    public String getNewName() {
        return name;
    }
}
