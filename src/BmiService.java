public class BmiService {
    public int calculate(int weightInKilograms, double heightInMeters) {
        double formula;
        formula = weightInKilograms / (heightInMeters * heightInMeters);
        int index = (int) (formula);
        return index;
    }


}
