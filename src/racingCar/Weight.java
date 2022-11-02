package racingCar;

public enum Weight {
    N_1(" с полной массой до 3,5 тонн"),
    N_2("с полной массой свыше 3,5 до 12 тонн"),
    N_3("с полной массой свыше 12 тонн");

    private final String enumerationWeight;

    Weight(String enumerationWeight) {
        if (enumerationWeight==null || enumerationWeight.isBlank()) {
            this.enumerationWeight = "No information";
        } else {
            this.enumerationWeight = enumerationWeight;
        }
    }

    public String getEnumerationWeight() {
        return enumerationWeight;
    }
}
