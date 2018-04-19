import java.util.ArrayList;
/**
 * Write a description of class Meter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Meter
{
    private String registreringsnummer, plassering, status;
    /**
     * Constructor for objects of class Meter
     */
    public Meter()
    {
        // initialise instance variables
        this("ukjent", "ukjent", "ukjent");
    }

    public Meter(String registreringsnummer, String plassering, String status)
    {
        setRegistreringsnummer(registreringsnummer);
        setPlassering(plassering);
        setStatus(status);

    }

    public void setRegistreringsnummer(String newRegnum)
    {
        this.registreringsnummer = newRegnum;
    }

    public void setPlassering(String newPlass)
    {
        this.plassering = newPlass;
    }

    public void setStatus(String newStatus)
    {
        this.status = newStatus;
    }

    public String getRegistreringsnummer()
    {
        return this.registreringsnummer;
    }

    public String getPlassering()
    {
        return this.plassering;
    }

    public String getStatus()
    {
        return this.status;
    }

    public String toString()
    {
        return
        "Regnummer: " + registreringsnummer + "\n" + 
        "Plassering: " + plassering + "\n" +
        "Status: " + status + "\n";
    }
    
    public boolean equals(Object o)
    {
        if(this == o){
            return true;
        }
        if(!(o instanceof Meter)){
            return false;
        }
        Meter meter = (Meter) o;
        if(!this.registreringsnummer.equals(meter.registreringsnummer)){
            return false;
        }
        if(!this.plassering.equals(meter.plassering)){
            return false;
        }
        if(!this.status.equals(meter.status)){
            return false;
        }
        return true;
    }
}
