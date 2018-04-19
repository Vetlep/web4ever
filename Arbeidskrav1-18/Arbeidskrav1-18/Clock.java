
/**
 * Write a description of class Clock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clock extends Meter
{
    public double sekunder;

    /**
     * Constructor for objects of class Weight
     */
    public Clock()
    {
        
    }
    
    public Clock(String registreringsnummer, String plassering, String status, double sekunder)
    {
        super(registreringsnummer, plassering, status);
        setTidsinterval(sekunder);
    }
    
    public void setTidsinterval(double newSekunder)
    {
        this.sekunder = newSekunder;
    }
    
    public double getSekunder()
    {
        return this.sekunder;
    }
    
    public String toString()
    {
        return "Klokke\n" + super.toString() + "Tidsinterval: " + sekunder + "\n";
    }
    
    public boolean equals(Object o)
    {
        if(this == o){
            return true;
        }
        if(!(o instanceof Clock)){
            return false;
        }
        if(!super.equals(o)){
            return false;
        }
        Clock c = (Clock) o;
        if(!(this.sekunder == c.sekunder)){
            return false;
        }
        return true;
    }
}
    