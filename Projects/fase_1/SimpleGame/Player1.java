package Projects.fase_1.SimpleGame;

public class Player1 {
    private  String name;
    private  String weapon;
    private  int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public void damageByGun1(){
        this.health -= 30;
        if(this.health <=0){
            this.health = 0;
        }
        System.out.println("Got hit by gun 1. Health is reduced by 30. New health is "+ this.health);
        // continue
    }
}
