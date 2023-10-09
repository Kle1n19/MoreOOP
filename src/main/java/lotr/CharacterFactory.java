package lotr;

import java.util.Random;
public class CharacterFactory {
    public Character CreateCharacter(){
        Random random = new Random();
        Character character;
        int randomInt = random.nextInt(4) + 1;
        switch (randomInt) {
            case 1:
                character = new Hobbit();
                break;
            case 2:
                character = new Elf();
                break;
            case 3:
                character = new King();
                break;
            case 4:
                character = new Knight();
                break;
            default:
                character = new Character();
                break;
        }
        return character;
    }
}
