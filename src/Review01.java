
public class Review01 {

    public static void main(String[] args) {
        int s = 1500;
        double t = 0.1;
        int tax = (int)tax(s,t);
        int money = (int)tax(s,t) + s;
        System.out.println(s + "円の商品の税込価格は" + money + "円(消費税は" + tax + "円)です。");
    }

    public static double tax(double s, double t) {
        double result = s*t;
        return result;
    }
}
