package multiInheritance;

public class city extends state{
    public city()
    {
        super();
        System.out.println();
    }

    public city(String country, String capital, String stateName, String language, String cityName, float cityArea) {
        super(country, capital, stateName, language);
        this.cityName = cityName;
        this.cityArea = cityArea;
    }

    @Override
    public String toString() {
        return "city{" +
                "cityName='" + cityName + '\'' +
                ", cityArea=" + cityArea +
                '}';
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    String cityName;
    float cityArea;

    public float getCityArea() {
        return cityArea;
    }

    public void setCityArea(float cityArea) {
        this.cityArea = cityArea;
    }
}
