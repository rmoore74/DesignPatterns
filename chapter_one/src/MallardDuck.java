/**
 * Created by Roger on 2/20/2016.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
