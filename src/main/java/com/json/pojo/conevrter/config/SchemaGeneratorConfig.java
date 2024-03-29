package com.json.pojo.conevrter.config;

import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

public class SchemaGeneratorConfig implements GenerationConfig {

    private String packageName;

    public SchemaGeneratorConfig(String packageName) {
        this.packageName = packageName;
    }


    @Override
    public boolean isGenerateBuilders() {
        return true;
    }

    @Override
    public boolean isIncludeTypeInfo() {
        return false;
    }

    @Override
    public boolean isIncludeConstructorPropertiesAnnotation() {
        return false;
    }

    @Override
    public boolean isUsePrimitives() {
        return false;
    }

    @Override
    public Iterator<URL> getSource() {
        return null;
    }

    @Override
    public File getTargetDirectory() {
        return null;
    }

    @Override
    public String getTargetPackage() {
        return null;
    }

    @Override
    public char[] getPropertyWordDelimiters() {
        return new char[0];
    }

    @Override
    public boolean isUseLongIntegers() {
        return false;
    }

    @Override
    public boolean isUseBigIntegers() {
        return false;
    }

    @Override
    public boolean isUseDoubleNumbers() {
        return false;
    }

    @Override
    public boolean isUseBigDecimals() {
        return false;
    }

    @Override
    public boolean isIncludeHashcodeAndEquals() {
        return false;
    }

    @Override
    public boolean isIncludeToString() {
        return false;
    }

    @Override
    public String[] getToStringExcludes() {
        return new String[0];
    }

    @Override
    public AnnotationStyle getAnnotationStyle() {
        return null;
    }

    @Override
    public boolean isUseTitleAsClassname() {
        return false;
    }

    @Override
    public InclusionLevel getInclusionLevel() {
        return InclusionLevel.ALWAYS;
    }

    @Override
    public Class<? extends Annotator> getCustomAnnotator() {
        return null;
    }

    @Override
    public Class<? extends RuleFactory> getCustomRuleFactory() {
        return null;
    }

    @Override
    public boolean isIncludeJsr303Annotations() {
        return false;
    }

    @Override
    public boolean isIncludeJsr305Annotations() {
        return false;
    }

    @Override
    public boolean isUseOptionalForGetters() {
        return false;
    }

    @Override
    public SourceType getSourceType() {
        return SourceType.JSON;
    }

    @Override
    public boolean isRemoveOldOutput() {
        return false;
    }

    @Override
    public String getOutputEncoding() {
        return null;
    }

    @Override
    public boolean isUseJodaDates() {
        return false;
    }

    @Override
    public boolean isUseJodaLocalDates() {
        return false;
    }

    @Override
    public boolean isUseJodaLocalTimes() {
        return false;
    }

    @Override
    public boolean isParcelable() {
        return false;
    }

    @Override
    public boolean isSerializable() {
        return false;
    }

    @Override
    public FileFilter getFileFilter() {
        return null;
    }

    @Override
    public boolean isInitializeCollections() {
        return false;
    }

    @Override
    public String getClassNamePrefix() {
        return null;
    }

    @Override
    public String getClassNameSuffix() {
        return null;
    }

    @Override
    public String[] getFileExtensions() {
        return new String[0];
    }

    @Override
    public boolean isIncludeConstructors() {
        return false;
    }

    @Override
    public boolean isConstructorsRequiredPropertiesOnly() {
        return false;
    }

    @Override
    public boolean isIncludeRequiredPropertiesConstructor() {
        return false;
    }

    @Override
    public boolean isIncludeAllPropertiesConstructor() {
        return false;
    }

    @Override
    public boolean isIncludeCopyConstructor() {
        return false;
    }

    @Override
    public boolean isIncludeAdditionalProperties() {
        return false;
    }

    @Override
    public boolean isIncludeGetters() {
        return false;
    }

    @Override
    public boolean isIncludeSetters() {
        return false;
    }

    @Override
    public String getTargetVersion() {
        return null;
    }

    @Override
    public boolean isIncludeDynamicAccessors() {
        return false;
    }

    @Override
    public boolean isIncludeDynamicGetters() {
        return false;
    }

    @Override
    public boolean isIncludeDynamicSetters() {
        return false;
    }

    @Override
    public boolean isIncludeDynamicBuilders() {
        return false;
    }

    @Override
    public String getDateTimeType() {
        return null;
    }

    @Override
    public String getDateType() {
        return null;
    }

    @Override
    public String getTimeType() {
        return null;
    }

    @Override
    public boolean isFormatDates() {
        return false;
    }

    @Override
    public boolean isFormatTimes() {
        return false;
    }

    @Override
    public boolean isFormatDateTimes() {
        return false;
    }

    @Override
    public String getCustomDatePattern() {
        return null;
    }

    @Override
    public String getCustomTimePattern() {
        return null;
    }

    @Override
    public String getCustomDateTimePattern() {
        return null;
    }

    @Override
    public String getRefFragmentPathDelimiters() {
        return null;
    }

    @Override
    public SourceSortOrder getSourceSortOrder() {
        return null;
    }

    @Override
    public Map<String, String> getFormatTypeMapping() {
        return null;
    }

    @Override
    public boolean isIncludeGeneratedAnnotation() {
        return false;
    }
}
