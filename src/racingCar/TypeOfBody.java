package racingCar;

public enum TypeOfBody {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купэ"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    VAN("Фургон"),
    MINIVAN("Минивэн"),
    PICKUP("Пикап");

    private final String enumerationTypeOfBody;

    TypeOfBody(String enumerationTypeOfBody) {
        if(enumerationTypeOfBody == null || enumerationTypeOfBody.isBlank()) {
            this.enumerationTypeOfBody = "No information";
        } else {
            this.enumerationTypeOfBody = enumerationTypeOfBody;
        }

    }

    public String getEnumerationTypeOfBody() {
        return enumerationTypeOfBody;
    }
}
