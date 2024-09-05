package HomeWork2;

public class Human extends Actor {
    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean MakeOrder) {
        super.isMakeOrder = MakeOrder;
    }

    @Override
    public void setTakeOrder(boolean TakeOrder) {
        super.isTakeOrder = TakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
}
