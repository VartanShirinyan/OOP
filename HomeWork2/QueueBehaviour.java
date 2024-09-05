package HomeWork2;

public interface QueueBehaviour {
    void takeQueue(Actor actor);

    void releaseFromQueue();

    void takeOrders();

    void giveOrders();
}
