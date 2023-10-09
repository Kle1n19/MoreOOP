package lotr;






public class Character {
    public int hp;
    public int power;
    public Character(){
        this.hp = 1;
        this.power = 1;
    }
    @Override
    public String toString(){
        return "hello";
    }
    public void setHp(int new_hp){
        if(new_hp>0){
            this.hp = new_hp;
        }
        else{
            this.hp = 0;
        }

    }
    public int getHp(){
        return this.hp;
    }
    public int getPower(){
        return this.power;
    }
    public boolean isAlive(){
        return this.hp > 0? true:false;
    }
    public void kick(Character c){
        c.setHp(c.hp-this.power);
    }
}
