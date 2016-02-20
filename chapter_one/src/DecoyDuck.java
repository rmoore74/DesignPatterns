/**
 * Created by Roger on 2/20/2016.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    public void display() {
        System.out.println("I'm not real, I'm a decoy.");
    }

}
