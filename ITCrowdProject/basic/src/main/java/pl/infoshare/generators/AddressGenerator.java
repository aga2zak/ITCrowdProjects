package pl.infoshare.generators;

public class AddressGenerator extends RandomGenerator {
  String street;
  String city;
  private String[] country={"Belgium","Brazil","Canada"};
  String postalCode;
  String state;

    public String generateStreetAddress() {

        return this.street=capitalize(generateRandomString(15))+ " " +generateRandomNumber(1,50);

    }

    public String generateCityAddress() {

        return this.city=capitalize(generateRandomString(15))+ " " +generateRandomNumber(1,50);

    }

    public String generateCountryAddress() {

        return country[generateRandomNumber(1,country.length-1)];
    }
}
