public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 63;
        float height = 1.71F;
        float bmi = service.calculate(weight, height);
        System.out.println(bmi);

    }
}
