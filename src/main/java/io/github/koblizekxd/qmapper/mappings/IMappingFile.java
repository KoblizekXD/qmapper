package io.github.koblizekxd.qmapper.mappings;

import java.io.File;

public interface IMappingFile {
    void read(File file);
    ClassMapping[] getClassMappings();
    MethodMapping[] getMethodMappings();
    FieldMapping[] getFieldMappings();
}
