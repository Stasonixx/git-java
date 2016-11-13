
public class Main1 {
    public static void main(String[] args) {
        Cat[] nayanCats = new Cat[15];
        Cat[] cats;
        cats = new Cat[3];
        Cat koshka = new Cat(); //stvorulu kota
        koshka.name = "Tom";
        cats[0] = koshka;
        cats[1] = new Cat();
        cats[2] = new Cat();
     //   System.out.println(cats[0].name);

        for (int i = 0; i < cats.length; i++) {
            Cat cat = cats[i];
            System.out.println(cat.name);

        }
        for (int i = 0; i < nayanCats.length; i++) {
            nayanCats[i] = new Cat();
            nayanCats[i].name = "Nayan " + i;
            
        }
        for (Cat nayanCat : nayanCats) {
            System.out.println(nayanCat.name);
        }
    }
}
