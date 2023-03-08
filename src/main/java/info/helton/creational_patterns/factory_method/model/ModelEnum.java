package info.helton.creational_patterns.factory_method.model;

public enum ModelEnum {
    STANDARD("standard"),
    HIGH_END("highEnd"),
    X("X"),
    ELEVEN("11");

    private final String model;

    private ModelEnum(String model) {
        this.model = model;
    }

    public String get() {
        return this.model;
    }
}
