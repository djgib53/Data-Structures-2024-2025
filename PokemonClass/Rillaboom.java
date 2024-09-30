
public class Rillaboom extends Pokemon
{
    public Rillaboom(){
        super(100, 125, 90, 60, 70, 85);
    }
    
    public Rillaboom(int inputHp, int inputAttack, int inputDefense, int inputSpAtk, int inputSpDef, int inputSpeed){
            super(inputHp, inputAttack, inputDefense, inputSpAtk, inputSpDef, inputSpeed);
    }
    
    public void wood_hammer(Pokemon anyPoorPokemon){
    
    int damage = anyPoorPokemon.getHp();
    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 120 * (this.getAttack() / anyPoorPokemon.getDefense()))/50;
    anyPoorPokemon.setHp(resultingLife);
    damage = damage - resultingLife;
    this.setHp(this.getHp() - (damage/3));

    }
    public void knock_off(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 65 * (this.getAttack() / anyPoorPokemon.getDefense()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
    public void slam(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 80 * (this.getAttack() / anyPoorPokemon.getDefense()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
    public void razor_leaf(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 55 * (this.getSpAtk() / anyPoorPokemon.getSpDef()))/50;
    anyPoorPokemon.setHp(resultingLife);

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
