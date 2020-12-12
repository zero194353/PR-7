public class Tester {
    public static void main(String[] args) {
        Plate plate = new Plate();
        plate.cook();
        Cup cup = new Cup();
        cup.cook();
        Bowl bowl = new Bowl();
        bowl.cook();
        System.out.println("Список блюд в конкретной посуде");
        System.out.println(plate.getTypeOfCook(2));
        System.out.println(cup.getTypeOfCook(3));
        System.out.println(bowl.getTypeOfCook(1));

        System.out.println("=========================");
        System.out.println("Список пород");

        Beagle Beagle = new Beagle();
        System.out.println(Beagle.toString() + "\nТип шерсти: " + Beagle.getFur() +"\nПорода: " + Beagle.getSize());

        System.out.println("=========================");
        System.out.println("Мебельный магазин");

        FurnitureShop furnitureShop = new FurnitureShop();
        for (int i=0; i<5; i++){
            Furniture x = new Chair();
            furnitureShop.Add(x);
        }
        for (int i=0; i<2; i++){
            Furniture x = new Bed();
            furnitureShop.Add(x);
        }
        for (int i=0; i<8; i++){
            Furniture x = new Table();
            furnitureShop.Add(x);
        }
        System.out.println(furnitureShop.getFurniture(6));
        System.out.println(furnitureShop.getFurniture(7));
        System.out.println(furnitureShop.getFurniture(1));
        System.out.println(furnitureShop.getFurniture(12));
    }
}
