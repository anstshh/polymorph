package racingCar;

public enum TypeBody {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купэ"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    VAN("Фургон"),
    MINIVAN("Минивэн"),
    PICKUP("Пикап");

    private final String enumerationTypeBody;

    TypeBody(String enumerationTypeBody) {
        if(enumerationTypeBody == null || enumerationTypeBody.isBlank()) {
            this.enumerationTypeBody = "No information";
        } else {
            this.enumerationTypeBody = enumerationTypeBody;
        }

    }

    public String getEnumerationTypeBody() {
        return enumerationTypeBody;
    }
}
