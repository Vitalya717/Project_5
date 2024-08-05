public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weightInKilograms = 74;
        double heightInMeters = 1.78;
        int bodyMassIndex = service.calculate(weightInKilograms, heightInMeters);
        System.out.println("Индекс массы тела равен: " + bodyMassIndex);
    }
}
