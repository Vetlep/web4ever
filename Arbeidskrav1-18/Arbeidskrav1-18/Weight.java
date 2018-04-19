
/**
 * Write a description of class Weight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Weight extends Meter
{
    public double maxGram, minGram;
    
    /**
     * Constructor for objects of class Weight
     */
    public Weight()
    {
        
    }
    
    public Weight(String registreringsnummer, String plassering, String status, double maxGram, double minGram)
    {
        super(registreringsnummer, plassering, status);
        setMåleintervall(maxGram, minGram);
    }
    
    public void setMåleintervall(double newMaxGram, double newMinGram)
    {
        this.maxGram = newMaxGram;
        this.minGram = newMinGram;
    }
    
    public double getMålintervall()
    {
        return this.maxGram + this.minGram;
    }
    
    public String toString()
    {
        return "Vekt\n" + super.toString() + "Måleintervall: " + minGram + " - " + maxGram + "\n";
    }
    
    public boolean equals(Object o)
    {
        if(this == o){
            return true;
        }
        if(!(o instanceof Weight)){
            return false;
        }
        if(!super.equals(o)){
            return false;
        }
        Weight w = (Weight) o;
        if(!(this.minGram == w.minGram)){
            return false;
        }
        if(!(this.maxGram == w.minGram)){
            return false;
        }
        return true;
    }
}
