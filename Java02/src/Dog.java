/**
 * Created by Admin on 21.10.2016.
 */
public class Dog {
    public static void main(String[] args) {
        String s = aport("Кістка", 20);
        System.out.println(s);
    }
    static String aport(String it, int amount) {
        String result = "Пожована " + it + ", кількість " + amount;
        return result;
    }
}
