package utils1;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.RandomStringGenerator;

public class DataGenerators {

    public static void main(String[] args) {
        int firstNameLength = 9;
        int lastNameLength = 12;
        int stateProvinceLength = 12;
        int emailLength = 9;
        int passwordLength = 8;
        int companyNameLength = 12;
        int customerStreetAddressLength = 15;
        int customerCityLength = 10;
        int postalCodeLengthFirstPart = 2;
        int postalCodeLengthSecondPart = 3;
        int customerPhoneLength = 9;

        RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
        RandomStringGenerator generatorForNumbers = new RandomStringGenerator.Builder().withinRange('1', '9').build();

        String firstName = generatingFirstName(firstNameLength, generator);
        String lastName = generatingLastName(lastNameLength, generator);
        String stateProvince = generatingStateProvince(stateProvinceLength, generator);
        String email = generatingEmail(emailLength, generator);
        String password = generatingPassword(passwordLength, generator);
        String companyName = generatingCompanyName(companyNameLength, generator);
        String customerStreetAddress = generatingCustomerStreetAddress(customerStreetAddressLength, generator);
        String customerCity = generatingCustomerCity(customerCityLength, generator);
        String postalCode = generatingPostalCode(postalCodeLengthFirstPart, postalCodeLengthSecondPart, generatorForNumbers);
        String customerPhone = generatingCustomerPhone(customerPhoneLength, generatorForNumbers);

        System.out.println("Set of data generated for customer is: " +"\n" +
                "First name: " + firstName +"\n" +
                "Last name: " + lastName +"\n" +
                "State / province: " + stateProvince +"\n" +
                "Email: " + email +"\n" +
                "Password: " + password +"\n" +
                "Company name: " + companyName +"\n" +
                "Street address: " + customerStreetAddress +"\n" +
                "City: " + customerCity +"\n" +
                "Postal code: " + postalCode +"\n" +
                "Phone number: " + customerPhone);
    }

    public static String generatingFirstName(int firstNameLength, RandomStringGenerator generator) {
        String firstName = generator.generate(firstNameLength);
        return StringUtils.capitalize(firstName);
    }

    public static String generatingLastName(int lastNameLength, RandomStringGenerator generator) {
        String lastName = generator.generate(lastNameLength);
        return StringUtils.capitalize(lastName);
    }

    public static String generatingStateProvince(int stateProvinceLength, RandomStringGenerator generator) {
        String stateProvince = generator.generate(stateProvinceLength);
        return StringUtils.capitalize(stateProvince);
    }
    public static String generatingEmail(int emailLength, RandomStringGenerator generator) {
        String emailUser = generator.generate(emailLength);
        String emailDomain = "@testtesttest.com";
        String emailAddress = emailUser + emailDomain;
        return emailAddress;
    }
    public static String generatingPassword(int passwordLength, RandomStringGenerator generator) {
        String password = generator.generate(passwordLength);
        return password;
    }
    public static String generatingCompanyName(int companyNameLength, RandomStringGenerator generator) {
        String companyName = generator.generate(companyNameLength);
        return StringUtils.capitalize(companyName);
    }

    public static String generatingCustomerStreetAddress(int customerStreetAddressLength, RandomStringGenerator generator) {
        String customerStreet = generator.generate(customerStreetAddressLength);
        double blockNumber = Math.random();
        blockNumber = (blockNumber*10)+1;
        int streetNumberBlock = (int)blockNumber;
        double flatNumber = Math.random();
        flatNumber = (flatNumber*100)+1;
        int streetNumberFlat = (int)flatNumber;

        String customerStreetAddress = customerStreet + " " + streetNumberBlock + "/" + streetNumberFlat;
        return StringUtils.capitalize(customerStreetAddress);
    }

    public static String generatingCustomerCity(int customerCityLength, RandomStringGenerator generator) {
        String city = generator.generate(customerCityLength);
        return StringUtils.capitalize(city);
    }

    public static String generatingPostalCode(int postalCodeLengthFirstPart, int postalCodeLengthSecondPart, RandomStringGenerator generator) {
        String postalCodeFirstPart = generator.generate(postalCodeLengthFirstPart);
        String dash = "-";
        String postalCodeSecondPart = generator.generate(postalCodeLengthSecondPart);
        String postalCode = postalCodeFirstPart + dash + postalCodeSecondPart;

        return postalCode;
    }

    public static String generatingCustomerPhone(int customerPhoneLength, RandomStringGenerator generator) {
        String customerPhone = generator.generate(customerPhoneLength);
        String prefix = "+48 ";
        String fullPhoneNumber = prefix + customerPhone;
        return fullPhoneNumber;
    }
}