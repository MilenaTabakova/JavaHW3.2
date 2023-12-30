public class BmiService {

    public int calculate(int weightInKilos, double heightInMeters) {

        double bmi = weightInKilos / (heightInMeters * heightInMeters);

        return (int) bmi;


    }

}
