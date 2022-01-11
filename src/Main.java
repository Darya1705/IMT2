public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float index = service.calculate(43, (float) 1.52);
        System.out.println(index);
    }
}
