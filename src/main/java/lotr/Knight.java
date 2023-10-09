package lotr;

import java.util.Random;
public class Knight extends lotr.Character{
    public Knight(){
        Random random = new Random();
        this.hp = random.nextInt(12 - 2 + 1) + 2;
        this.power = random.nextInt(12 - 2 + 1) + 2;
    }
    @Override
    public void kick(Character c){
        Random random = new Random();
        int damage = random.nextInt(this.power+1);
        c.setHp(c.hp-damage);
    }
    @Override
    public String toString(){
        return "Knight{hp="+this.hp+", power="+this.power+"}";
    }
    
}
