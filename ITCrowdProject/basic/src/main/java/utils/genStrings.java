package utils;

import org.apache.commons.text.RandomStringGenerator;

public class genStrings {

    public void  generatorNames()
    {
        int firsNameLength = 8;
        int lastNameLength = 14;

        // Generates a 20 code point string, using only the letters a-z
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('a', 'z').build();
        String firstName = generator.generate(firsNameLength);
        String lastName = generator.generate(lastNameLength);

        System.out.println(firstName);
        System.out.println(lastName);


    }
}
