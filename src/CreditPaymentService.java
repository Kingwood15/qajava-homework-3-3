public class CreditPaymentService {
    public int calculate(int amount, int years, float percent) {

        int mounth;
        double mounthPercent, calcul;

        mounth = years * 12;
        mounthPercent = percent /100 / 12;

        calcul = amount *(mounthPercent * Math.pow((1+mounthPercent),mounth) / (Math.pow(1+mounthPercent,mounth)-1));

        return (int)calcul;
    }
}
