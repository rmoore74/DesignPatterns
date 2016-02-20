/**
 * Created by Roger on 2/20/2016.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber ducky.");
    }

}
