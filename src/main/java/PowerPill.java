
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (Leen Jean)
 * @version (0.1)
 */
public class PowerPill
{
    public static final int DEFAULT_POWER = 10;

    // instance variables
    private int power;
    private String name;

    // constructors
    /**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @param name the name of this power pill.
     */
    public PowerPill(String name ){
        this.power = DEFAULT_POWER;
        this.name = name;
    }

    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */

    public PowerPill(String name, int power ){
        this.power = power;
        this.name = name;
    }


    // accessor methods

    public int getPower(){
        return power;
}


    // mutator methods

    public void setPower(int power){
        this.power = power;

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return("PowerPill " + name + " = " + power );
    }




}