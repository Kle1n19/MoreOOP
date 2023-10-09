package lotr;

public class Hobbit extends Character{
    public Hobbit(){
        this.hp = 3;
        this.power = 0;
    }
    @Override
    public String toString(){
        return "Hobbit{hp="+this.hp+", power="+this.power+"}";
    }
    public String toCry(){
        return "Cry";
    } 
    @Override
    public void kick(Character c){toCry();}
}
