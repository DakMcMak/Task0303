public class Main {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(200, 0.95));
        System.out.println(convertEurToUsd(200, 0.94));
    }

    public static double convertEurToUsd(int eur, double course) {
        double convertEurToUsd = eur * course;
        return convertEurToUsd;
    }
}
