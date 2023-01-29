
public class Review01 {

    public static void main(String[] args) {
        int s = 1500;
        int t = 10;
        int tax = tax(s,t);
        int money = tax(s,t) + s;
        System.out.println(s + "円の商品の税込価格は" + money + "円(消費税は" + tax + "円)です。");
    }

    public static int tax(int s, int t) {
        int result = s/t;
        return result;
    }
}
