package HomeWork2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue = new ArrayList<>();
    private List<Actor> marketActors = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        if (!queue.contains(actor)) {
            queue.add(actor);
            System.out.println(actor.getName() + " в магазине.");
        } else {
            System.out.println(actor.getName() + " в очереди.");
        }
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        if (marketActors.remove(actor)) {
            queue.remove(actor);
            System.out.println(actor.getName() + " освобожден из очереди.");
        } else {
            System.out.println(actor.getName() + " не находится в магазине.");
        }
    }

    @Override
    public void update() {
        for (Actor actor : marketActors) {
            if (actor.isMakeOrder()) {
                System.out.println(actor.getName() + " делает заказ.");
            }

            if (actor.isTakeOrder()) {
                System.out.println(actor.getName() + " принимает заказ.");
            }
        }

        for (Actor actor : marketActors) {
            actor.setMakeOrder(false);
            actor.setTakeOrder(false);
        }
    }

    @Override
    public void takeQueue(Actor actor) {
        acceptToMarket(actor);
    }

    @Override
    public void releaseFromQueue() {
        for (Actor actor : new ArrayList<>(queue)) {
            releaseFromMarket(actor);
        }
    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }
}
