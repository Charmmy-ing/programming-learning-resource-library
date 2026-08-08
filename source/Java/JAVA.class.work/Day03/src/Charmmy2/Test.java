package Charmmy2;

public class Test {
    public static void main(String[] args) {
        MonkeyAssistant assistant1 = new MonkeyAssistant();
        MonkeyAssistant assistant2 = new MonkeyAssistant("皮皮", 2, 48.0);
        assistant1.printDetails();
        assistant2.printDetails();
        assistant1.climbTree();
        assistant2.climbTree();
        assistant1.celsiusToFahrenheit(25.0);
        assistant1.celsiusToFahrenheit(25);
        assistant1.fahrenheitToCelsius(77);
    }
}
