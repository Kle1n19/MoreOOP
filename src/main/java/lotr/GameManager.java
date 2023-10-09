package lotr;

public class GameManager {
    public void fight(Character c1, Character c2){
        while (c1.isAlive() && c2.isAlive()){
            System.out.println("C1 kick C2");
            c1.kick(c2);
            System.out.println("Stats: \n");
            System.out.println(c1.toString()+'\n');
            System.out.println(c2.toString()+'\n');
            if(!c2.isAlive()){
                break;
            }
            System.out.println("C2 kick C1");
            c1.kick(c2);
            System.out.println("Stats: \n");
            System.out.println(c1.toString()+'\n');
            System.out.println(c2.toString()+'\n');

        }
    }
}
