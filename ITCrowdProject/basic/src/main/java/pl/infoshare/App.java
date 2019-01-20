package pl.infoshare;

import utils.*;


public class App 
{
    public static void main( String[] args )

    {
        genStrings genName = new genStrings();
        genName.generatorNames();

        genStrings1 genFullName = new genStrings1();
        String fullName = genFullName.generatorNames1();
        System.out.println(fullName);

        genStrings2 genFirstName = new genStrings2();
        genStrings2 genLastName = new genStrings2();
        String fullName1 = genFirstName.generatorNames1()+" "+genLastName.generatorNames2();
        System.out.println(fullName1);

//        genStrings3 genFirstName1 = new genStrings3(); jak static to to nie jest potrzebne
        String fullName2 = genStrings3.generatorNames1()+" "+genStrings3.generatorNames2();
        System.out.println(fullName2);

        String fullName3 = genStrings4.generatorNames1()+" "+genStrings4.generatorNames2();
        System.out.println(fullName3);

    }

}
