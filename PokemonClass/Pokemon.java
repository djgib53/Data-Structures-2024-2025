public class Pokemon implements CompareTo
{
    private int hp;
    private int attack;
    private int defense;
    private int spatk;
    private int spdef;
    private int speed;
    
    public Pokemon (int userHp, int userAttack, int userDefense, int userSpAtk, int userSpDef, int userSpeed){
        hp = userHp;
        attack = userAttack;
        defense = userDefense;
        spatk = userSpAtk;
        spdef = userSpDef;
        speed = userSpeed;
    }
    
    public int getHp(){
        if (hp > 0){
        return hp;
        }
        else{
            setHp(0);
            return hp;
        }
    }
    public void setHp(int inputHp){
        hp = inputHp;
    }
    
    public int getAttack(){
        return attack;
    }
    public void setAttack(int inputAttack){
        attack = inputAttack;
    }
    
    public int getDefense(){
        return defense;
    }
    public void setDefense(int inputDefense){
        defense = inputDefense;
    }
    
    public int getSpAtk(){
        return spatk;
    }
    public void setSpAtk(int inputSpAtk){
        spatk = inputSpAtk;
    }
    
    public int getSpDef(){
        return spdef;
    }
    public void setSpDef(int inputSpDef){
        spdef = inputSpDef;
    }
    
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int inputSpeed){
        speed = inputSpeed;
    }
    
    @Override
    public int compareTo(Object obj){
        Pokemon temp = null;
        
        temp = (Pokemon)obj;
        int firstSpeed = this.getSpeed();
        int secondSpeed = temp.getSpeed();
        if (firstSpeed > secondSpeed){
            return 1;
        }else if (firstSpeed == secondSpeed){
            return 0;
        }else{
            return -1;
        }
    }
    
    @Override
    public boolean equals(Object objPokemon){
        Pokemon anyPokemon =(Pokemon)objPokemon;
        if (this.getHp() == anyPokemon.getHp() && this.getAttack() == anyPokemon.getAttack() && this.getDefense() == anyPokemon.getDefense() && this.getSpAtk() == anyPokemon.getSpAtk() && this.getSpDef() == anyPokemon.getSpDef() && this.getSpeed() == anyPokemon.getSpeed()){
            return true;
        }else{
                return false;
            }
        }
}    
