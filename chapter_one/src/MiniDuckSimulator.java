/**
 * Created by Roger on 2/20/2016.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        System.out.println("Mallard Duck:");
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        System.out.println("Model Duck:");
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();

        Duck redhead = new RedheadDuck();
        System.out.println("Redhead Duck:");
        redhead.performFly();
        redhead.display();

        Duck rubber = new RubberDuck();
        System.out.println("Rubber Duck:");
        rubber.performFly();
        rubber.performQuack();

        Duck decoy = new DecoyDuck();
        System.out.println("Decoy Duck:");
        decoy.performQuack();
        decoy.setQuackBehaviour(new Squeak());
        decoy.performQuack();

        mallard.swim();
        model.swim();
        redhead.swim();
        rubber.swim();
        decoy.swim();
    }

}
