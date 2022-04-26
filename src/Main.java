public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        float percent = 9.99F;

        int pay1 = service.calculate(1_000_000, 1, percent);
        System.out.println("Ежемесячный платёж: " + pay1 + " Процентная ставка: " + percent);

        int pay2 = service.calculate(1_000_000, 2, percent);
        System.out.println("Ежемесячный платёж: " + pay2 + " Процентная ставка: " + percent);

        int pay3 = service.calculate(1_000_000, 3, percent);
        System.out.println("Ежемесячный платёж: " + pay3 + " Процентная ставка: " + percent);
    }
}
