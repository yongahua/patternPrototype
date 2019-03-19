package gupao.vip.pattern.prototype;

public class Client {
    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype packagePrototype) {
        return (Prototype)packagePrototype.clone();
    }
}
