public class Crow extends bird implements Flyable,Eating,makeSound{
    FlyingBehaviour fb;
    public Crow(FlyingBehaviour fb){
        this.fb=fb;
    }
    public void fly(){
        this.fb.makeFly();
    }
    public void eating(){
        System.out.println("Crow can eat");
    }
    public void makeSound(){
        System.out.println("Crow can make Sound");
    }
}
