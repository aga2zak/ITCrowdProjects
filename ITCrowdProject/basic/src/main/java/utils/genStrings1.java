package utils;

import org.apache.commons.text.RandomStringGenerator;

public class genStrings1 {

    public String generatorNames1()
    {
        int firsNameLength = 8;
        int lastNameLength = 14;

        // Generates a 20 code point string, using only the letters a-z
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('a', 'z').build();
        String firstName = generator.generate(firsNameLength);
        String lastName = generator.generate(lastNameLength);

        return firstName +" "+lastName;

    }
}
