package multiInheritance;

public class driver {
    public static void main(String args[])

    {
        //country,capital,stateName, language,cityName,cityArea
        city mycity = new city();
        mycity.setCountry("India");
        mycity.setCapital("Delhi");
        mycity.setStateName("Guj");
        mycity.setLanguage("Guj");
        mycity.setCityName("Amd");
        mycity.setCityArea(5000);
        System.out.println(mycity);
    }
}
