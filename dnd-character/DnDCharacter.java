import java.util.ArrayList;
import java.util.Collections;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitPoints;

    public DnDCharacter(){
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hitPoints = modifier(this.constitution) + 10;
    }

    int ability() {
        int sum = 0;
        ArrayList <Integer> rolls = new ArrayList<>(4);
        for(int x = 0; x < 5; x++){
            rolls.add((int)Math.round(Math.random()*6));
        }
        Collections.sort(rolls);
        rolls.remove(0);

        for(int x: rolls){
            sum += x;
        }
        return (int) sum;
   }

   public int getStrength() {

       return(this.strength);
   }

   public int getDexterity() {
        return(this.dexterity);
   }

   public int getConstitution() {
        return(this.constitution);
   }

   public int getIntelligence() {
    return(this.intelligence);
   }

   public int getWisdom() {
    return(this.wisdom);
   }

   public int getCharisma() {
    return(this.charisma);
   }

   public int getHitpoints() {
    return (this.hitPoints);
    }


    int modifier(int constitution) {
        int mod = (int)Math.floor((constitution - 10) / 2.0);
        return mod;
    }

    
}
