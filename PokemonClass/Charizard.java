
public class Charizard extends Pokemon
{
    public Charizard(){
        super(78, 84, 78, 109, 85, 100);
    }
    
    public Charizard(int inputHp, int inputAttack, int inputDefense, int inputSpAtk, int inputSpDef, int inputSpeed){
            super(inputHp, inputAttack, inputDefense, inputSpAtk, inputSpDef, inputSpeed);
    }
    
    public void flamethrower(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 90 * (this.getSpAtk() / anyPoorPokemon.getSpDef()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
    public void dragon_breath(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 60 * (this.getSpAtk() / anyPoorPokemon.getSpDef()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
    public void fire_fang(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 65 * (this.getAttack() / anyPoorPokemon.getDefense()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
    public void air_slash(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 75 * (this.getSpAtk() / anyPoorPokemon.getSpDef()))/50;
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
