

public class TesterStadium
{
    
    static String PikachuName = "Bob";
    static String CharizardName = "Jimmy";
    static String SwampertName = "Dave";
    static String RillaboomName = "Mike";
    
    public static void main(String[] args){
    Pikachu bob = new Pikachu();
    Charizard jimmy = new Charizard();
    Swampert dave = new Swampert();
    Rillaboom mike = new Rillaboom();
    OtherPikachu barry = new OtherPikachu();
    /*
    //Start of battle
    System.out.println("Battle Music Initialized");
    System.out.println(PikachuName + " the Pikachu's Hp: " + bob.getHp() );
    System.out.println(CharizardName + " the Charizard's Hp: " + jimmy.getHp() );
    System.out.println(SwampertName + " the Swampert's Hp: " + dave.getHp() );
    System.out.println(RillaboomName + " the Rillaboom's Hp: " + mike.getHp() );

    if (bob.getHp() > 0){
    bob.thunderbolt(mike);
    System.out.println(PikachuName + " used Thunderbolt on " + RillaboomName + "!");
    System.out.println(RillaboomName + " Hp: " + mike.getHp() );
    }
    
    if (jimmy.getHp() > 0){
    jimmy.flamethrower(bob);
    System.out.println(CharizardName + " used Flamethrower on " + PikachuName + "!");
    System.out.println(PikachuName + " Hp: " + bob.getHp() );
    }
    
    if (dave.getHp() > 0){
    dave.water_pulse(jimmy);
    System.out.println(SwampertName + " used Water Pulse on " + CharizardName + "!");
    System.out.println(CharizardName + " Hp: " + jimmy.getHp() );
    }
    
    if (mike.getHp() > 0){
    mike.wood_hammer(dave);
    System.out.println(RillaboomName + " used Wood Hammer on " + SwampertName + "!");
    System.out.println(SwampertName + " Hp: " + dave.getHp() );
    }
    
    //End of Round 1
    System.out.println(PikachuName + " has fainted!");
    
    //Start of Round 2
    System.out.println(PikachuName + " the Pikachu's Hp: " + bob.getHp() );
    System.out.println(CharizardName + " the Charizard's Hp: " + jimmy.getHp() );
    System.out.println(SwampertName + " the Swampert's Hp: " + dave.getHp() );
    System.out.println(RillaboomName + " the Rillaboom's Hp: " + mike.getHp() );
    
    if (jimmy.getHp() > 0){
    jimmy.dragon_breath(mike);
    System.out.println(CharizardName + " used Dragon Breath on " + RillaboomName + "!");
    System.out.println(RillaboomName + " Hp: " + mike.getHp() );
    }
    
    if (dave.getHp() > 0){
    dave.hammer_arm(jimmy);
    System.out.println(SwampertName + " used Hammer Arm on " + CharizardName + "!");
    System.out.println(CharizardName + " Hp: " + jimmy.getHp() );
    }
    
    if (mike.getHp() > 0){
    mike.knock_off(dave);
    System.out.println(RillaboomName + " used Knock Off on " + SwampertName + "!");
    System.out.println(SwampertName + " Hp: " + dave.getHp() );
    }
    //End of Round 2
    
    //Start of Round 3
    System.out.println(PikachuName + " the Pikachu's Hp: " + bob.getHp() );
    System.out.println(CharizardName + " the Charizard's Hp: " + jimmy.getHp() );
    System.out.println(SwampertName + " the Swampert's Hp: " + dave.getHp() );
    System.out.println(RillaboomName + " the Rillaboom's Hp: " + mike.getHp() );
    
    if (jimmy.getHp() > 0){
    jimmy.fire_fang(mike);
    System.out.println(CharizardName + " used Fire Fang on " + RillaboomName + "!");
    System.out.println(RillaboomName + " Hp: " + mike.getHp() );
    }
    
    if (dave.getHp() > 0){
    dave.take_down(jimmy);
    System.out.println(SwampertName + " used Take Down on " + CharizardName + "!");
    System.out.println(CharizardName + " Hp: " + jimmy.getHp() );
    }
    
    if (mike.getHp() > 0){
    mike.slam(dave);
    System.out.println(RillaboomName + " used Slam on " + SwampertName + "!");
    System.out.println(SwampertName + " Hp: " + dave.getHp() );
    }
    //End of Round 3
    System.out.println(CharizardName + " has fainted!");
    System.out.println(SwampertName + " has fainted!");
    System.out.println(RillaboomName + " is the winner!!!");
    
   
    }
    */
    System.out.println(bob.equals(mike));
    System.out.println(bob.equals(barry));
    System.out.println("----------");
    System.out.println(dave.compareTo(bob));
    System.out.println(bob.compareTo(mike));
    System.out.println(bob.compareTo(barry));
    } 
}
