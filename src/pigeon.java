public class pigeon extends bird implements Flyable,Eating,makeSound{

    FlyingBehaviour fb;
    public pigeon (FlyingBehaviour fb){
        this.fb=fb;
    }
    public void fly(){
        this.fb.makeFly();
    }
    public void eating(){
        System.out.println("Pigeon can eat");
    }
    public void makeSound(){
        System.out.println("Pigeon can make Sound");
    }
}
