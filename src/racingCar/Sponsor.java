package racingCar;

import java.util.Objects;

public class Sponsor {
    String nameCompany;
    int supportSum;

    public Sponsor(String nameCompany, int supportSum) {
        this.nameCompany = nameCompany;
        this.supportSum = supportSum;
    }
    public void toSponsor(){
        System.out.printf("Спонсор \"%s\" спонсировал заезд %d%n", nameCompany,supportSum);
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public int getSupportSum() {
        return supportSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return supportSum == sponsor.supportSum && Objects.equals(nameCompany, sponsor.nameCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCompany, supportSum);
    }
}