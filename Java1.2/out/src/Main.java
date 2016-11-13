
public class Main {
    public static void main(String[] args) {
        String[] names = {"Kitty", "Murka", "Vasilina"};
        int[] ages = {3, 5, 6};
        int[] lives;
        lives = new int[3];
        lives[0] = 7;
        lives[1] = 7;
        lives[2] = 7;


        //itar
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }
        for (int age : ages) {
            System.out.println(age);
        }

    }
}