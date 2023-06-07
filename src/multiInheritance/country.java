package multiInheritance;

public class country {
    String country;
    String capital;

    public country(String country,String capital) {

        this.country = country;
        this.capital = capital;
    }

    public country() {

    }

    @Override
    public String toString() {
        return "country{" +
                "country='" + country + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
