public class Sparrow extends bird implements Flyable,Eating,makeSound{
    FlyingBehaviour fb;
    public Sparrow(FlyingBehaviour fb){
        this.fb=fb;
    }
    public void fly(){
        this.fb.makeFly();
    }
    public void eating(){
        System.out.println("Sparrow can eat");
    }
    public void makeSound(){
        System.out.println("Sparrow can make Sound");
    }
}
