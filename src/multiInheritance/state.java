package multiInheritance;

public class state extends country{
    String StateName;
    String Language;

    public state() {
        super();
    }

    @Override
    public String toString() {
        return "state{" +
                "StateName='" + StateName + '\'' +
                ", Language='" + Language + '\'' +
                ", country='" + country + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String stateName) {
        StateName = stateName;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public state(String country, String capital, String stateName, String language) {
        super(country, capital);
        StateName = stateName;
        Language = language;
    }
}
