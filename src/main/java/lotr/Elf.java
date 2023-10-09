package lotr;

public class Elf extends Character{
    public Elf(){
        this.power = 10;
        this.hp = 10;
    }
    @Override
    public void kick(Character c){
        c.setHp(c.hp-this.power);
        this.power -=1;
    }
    public String toString(){
        return "Elf{hp="+this.hp+", power="+this.power+"}";
    }

}
