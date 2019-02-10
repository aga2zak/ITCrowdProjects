package pl.infoshare.generators;

public class addressGenerator extends RandomGenerator {

    private static String[] country={"Belgium","Brazil","Canada"};

    public static String generateStreetAddress() {

        return capitalize(generateRandomString(15))+ " " + generateRandomNumber(1,50);

    }

    public static String generateCityAddress() {

        return capitalize(generateRandomString(10));

    }

    public  static String generateCountryAddress() {

        return country[generateRandomNumber(1,country.length-1)];
    }

    public static String generatePostalCodeAddress() {

        return generateRandomNumber(2,9) + "-" + generateRandomNumber(3,9);
    }

}
