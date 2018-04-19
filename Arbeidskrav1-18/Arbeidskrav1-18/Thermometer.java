
/**
 * Write a description of class Thermometer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Thermometer extends Meter
{
    private double minTemp, maxTemp;

    /**
     * Constructor for objects of class Weight
     */
    public Thermometer()
    {
        
    }
    
    public Thermometer(String registreringsnummer, String plassering, String status, double minTemp, double maxTemp)
    {
        super(registreringsnummer, plassering, status);
        setTemperatur(minTemp, maxTemp);
    }
    
    public void setTemperatur(double newMinTemp, double newMaxTemp)
    {
        this.minTemp = newMinTemp;
        this.maxTemp = newMaxTemp;
    }
    
    public double getTemperatur()
    {
        return this.minTemp + this.maxTemp;
    }
    
    public String toString()
    {
        return "Termometer\n" + super.toString() + "Min og maks temperatur: " + minTemp + " - " + maxTemp + "\n";
    }
    
    public boolean equals(Object o)
    {
        if(this == o){
            return true;
        }
        if(!(o instanceof Thermometer)){
            return false;
        }
        if(!super.equals(o)){
            return false;
        }
        Thermometer temp = (Thermometer) o;
        if(!(this.minTemp == temp.minTemp)){
            return false;
        }
        if(!(this.maxTemp == temp.maxTemp)){
            return false;
        }
        return true;
    }
}
