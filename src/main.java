public class main {
    public static void main(String[] args) {
       pigeon p=new pigeon(new CSFB());    //here implements CSFB Behaviour and through that we are checking the
       p.fly();                           // the flying behaviour of pigeon
       p.eating();
       p.makeSound();

       Penguin pg=new Penguin();    //penguin can eat in his own way and create sound in his own way,
        pg.eating();                         //so no need to implemnet crowSparrowFlyingBehaviour(CSFB),but penguin cannot fly
        pg.makeSound();                          //hence , not calling fly method from flyable interface


        Sparrow s=new Sparrow(new CSFB());   //implements CSFB behaviour for flying behaviour check
        s.fly();
        s.eating();
        s.makeSound();

        Crow c=new Crow(new CSFB()); //implements CSFB behaviour
        c.fly();
        c.eating();
        c.makeSound();

        Ostrich o=new Ostrich(); //ostrich do not implements CSFB behaviour
        o.fly();
        o.eating();
        o.makeSound();


//implement crow,sparrow,ostrich also
    }
}
