package AdventureGame;

import java.util.ArrayList;

public class Inventory {
     private Weapon weapon;
     private Armor armor;
     private ArrayList awards = new ArrayList();
     private int _itemCount = 0;

     public Inventory() {
          this.weapon = new Weapon(-1, "Punch", 0, 0);
          this.armor = new Armor(-1, "Rag", 0, 0);
     }

     public Weapon getWeapon() {
          return weapon;
     }

     public void setWeapon(Weapon weapon) {
          this.weapon = weapon;
     }

     public Armor getArmor() {
          return armor;
     }

     public void setArmor(Armor armor) {
          this.armor = armor;
     }

     public ArrayList getAwards() {
          return awards;
     }

     public void setAwards(String award) {
          awards.add(_itemCount, award);
          _itemCount++;
     }

     // If award hasn't collected yet return false else return true
     public boolean isAwardCollected(String awardOfLoc) {
          for (Object award : awards) {
               if (award.equals(awardOfLoc)) {
                    return true;
               }
          }
          return false;
     }
}
