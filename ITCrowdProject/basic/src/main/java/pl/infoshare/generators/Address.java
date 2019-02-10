package pl.infoshare.generators;

import static pl.infoshare.generators.addressGenerator.*;

public class Address  {
  String street;
  String city;
  String country;
  String postalCode;
  String state;

  public Address(){
      this.street=generateStreetAddress();
      this.city = generateCityAddress();
      this.country=generateCountryAddress();
      this.postalCode=generatePostalCodeAddress();
  }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
