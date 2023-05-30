public class strings {

    void str() {
        String mon = "feb";
        switch (mon) {
            case "jan":
                System.out.println("31 days");
                break;
            case "feb":
                System.out.println("28 days");
                break;
            case "mar":
                System.out.println("31 days");
                break;
            case "apr":
                System.out.println("30 days");
                break;
            case "may":
                System.out.println("31 days");
                break;
            case "jun":
                System.out.println("30 days");
                break;
            case "jul":
                System.out.println("31 days");
                break;
            case "aug":
                System.out.println("31 days");
                break;
            case "sep":
                System.out.println("30 days");
                break;
            case "oct":
                System.out.println("31 days");
                break;
            case "nov":
                System.out.println("30 days");
                break;
            case "dec":
                System.out.println("31 days");
                break;
        }
    }
    public static void main(String[] args)
    {
        strings s=new strings();
        s.str();
    }
}
