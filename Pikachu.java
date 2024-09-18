

public class Pikachu extends Pokemon
{
    public Pikachu(){
        super(35, 55, 40, 50, 50, 90);
        }
        
    public Pikachu(int inputHp, int inputAttack, int inputDefense, int inputSpAtk, int inputSpDef, int inputSpeed){
            super(inputHp, inputAttack, inputDefense, inputSpAtk, inputSpDef, inputSpeed);
    }

    public void volt_tackle(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 120 * (this.getAttack() / anyPoorPokemon.getDefense()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
    public void thunderbolt(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 90 * (this.getSpAtk() / anyPoorPokemon.getSpDef()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
    public void quick_attack(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 40 * (this.getAttack() / anyPoorPokemon.getDefense()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
    public void spark(Pokemon anyPoorPokemon){

    int resultingLife = anyPoorPokemon.getHp() - (((2*50)/5) * 65 * (this.getAttack() / anyPoorPokemon.getDefense()))/50;
    anyPoorPokemon.setHp(resultingLife);

    }
}
