package utils;

import org.apache.commons.text.RandomStringGenerator;

public class genStrings2 {

    public String generatorNames1()
    {
        int firsNameLength = 8;

        String firstName = generateData(firsNameLength);

        return firstName;

    }

    public String generatorNames2()
    {

        int lastNameLength = 14;

        String lastName = generateData(lastNameLength );

        return lastName;

    }

    private String generateData(int length){
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('a', 'z').build();

        return generator.generate(length);
    }
}
