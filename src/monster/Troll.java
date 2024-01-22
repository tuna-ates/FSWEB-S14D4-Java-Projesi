package monster;

public class Troll  extends Monster implements Poisonable,Bleedable{
    public Troll( int hitPoints, double damage) {
        super("Trol", hitPoints, damage);
    }




    @java.lang.Override
    public double bleed() {
        return super.getDamage()*(0.25);
    }

    @java.lang.Override
    public double poison() {
        return super.getDamage()*(0.3);
    }

    @java.lang.Override
    public double attack() {
        return super.getDamage()+this.bleed()+this.poison();
    }
}
