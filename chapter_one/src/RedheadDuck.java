/**
 * Created by Roger on 2/20/2016.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a duck and I'm red");
    }
}
