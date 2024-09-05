package HomeWork2;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();

        Human human1 = new Human("Энтони Хопкинс");
        Human human2 = new Human("Тони Монтано");
        Human human3 = new Human("Джеки Чан");

        human1.setMakeOrder(true);
        human2.setMakeOrder(false);
        human3.setMakeOrder(true);

        market.takeQueue(human1);
        market.takeQueue(human2);
        market.takeQueue(human3);

        market.releaseFromQueue();
        market.update();

        System.out.println("\nЧем занимаются актеры:\n");
        System.out.println(human1.getName() + ", Заказывает: " + human1.isMakeOrder());
        System.out.println(human2.getName() + ", Заказывает: " + human2.isMakeOrder());
        System.out.println(human3.getName() + ", Заказывает: " + human3.isMakeOrder());
    }
}
