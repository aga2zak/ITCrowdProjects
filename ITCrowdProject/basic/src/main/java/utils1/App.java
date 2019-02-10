package utils1;

//import pl.infoshare.utils1.PhoneNumber;
//import pl.infoshare.utils1.generatorFullName;

public class App {
    public static void main(String[] args) {
        String number = PhoneNumber.getRandomPhoneNumber();
        PhoneNumber.printNumber(number);

        String fullName = generatorFullName.generatorNames1()+" "+generatorFullName.generatorNames2();
        System.out.println(fullName);
    }
}
