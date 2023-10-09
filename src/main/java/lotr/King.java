package lotr;

import java.util.Random;
public class King extends lotr.Character{
    public King(){
        Random random = new Random();
        this.hp = random.nextInt(15 - 5) + 5;
        this.power = random.nextInt(15 - 5) + 5;
    }
    @Override
    public void kick(Character c){
        Random random = new Random();
        int damage = random.nextInt(this.power+1);
        c.setHp(c.hp-damage);
    }
    @Override
    public String toString(){
        return "King{hp="+this.hp+", power="+this.power+"}";
    }
    
}
