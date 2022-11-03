package racingCar;

public enum Capacity {
    VERY_SMALL("особо малая (до 10 мест)"),
    SMALL("малая (до 25 мест)"),
    MEDIUM("средняя (40–50 мест)"),
    LARGE("большая (60-80 мест)"),
    VERY_LARGE("очень большая (100-120 мест)");

    private final String enumerationCapacity;

    Capacity (String enumerationCapacity) {
        if (enumerationCapacity == null || enumerationCapacity.isBlank()) {
            this.enumerationCapacity = "No information";
        } else {
            this.enumerationCapacity = enumerationCapacity;
        }
    }

    public String getEnumerationCapacity() {
        return enumerationCapacity;
    }
}
