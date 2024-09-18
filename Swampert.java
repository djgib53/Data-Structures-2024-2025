
public class Swampert extends Pokemon
{
    public Swampert(){
        super(100, 110, 90, 85, 90, 60);
    }
    
    public Swampert(int inputHp, int inputAttack, int inputDefense, int inputSpAtk, int inputSpDef, int inputSpeed){
            super(inputHp, inputAttack, inputDefense, inputSpAtk, inputSpDef, inputSpeed);
    }
    
    public void earthquake(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 100 * (this.getAttack() / anyPoorPokemon.getDefense()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
    public void hammer_arm(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 100 * (this.getAttack() / anyPoorPokemon.getDefense()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
    public void water_pulse(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 60 * (this.getSpAtk() / anyPoorPokemon.getSpDef()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
    public void take_down(Pokemon anyPoorPokemon){

    int damage = anyPoorPokemon.getHp();
    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 60 * (this.getAttack() / anyPoorPokemon.getDefense()))/50;
    anyPoorPokemon.setHp(resultingLife);
    damage = damage - resultingLife;
    this.setHp(this.getHp() - (damage/4));

    }
    
    @Override
    public boolean equals(Object objPokemon){
        Pokemon anyPokemon =(Pokemon)objPokemon;
        if (this.getHp() == anyPokemon.getHp() & this.getAttack() == anyPokemon.getAttack() & this.getDefense() == anyPokemon.getDefense() & this.getSpAtk() == anyPokemon.getSpAtk() & this.getSpDef() == anyPokemon.getSpDef() & this.getSpeed() == anyPokemon.getSpeed()){
            return true;
        }else{
                return false;
            }
        }
}
