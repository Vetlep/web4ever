import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class MeterArchive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MeterArchive
{
    private List<Meter> instrumenter;

    public MeterArchive()
    {
        instrumenter = new ArrayList<>();
    }

    //Legge til instrumenter
    public void addInstrument(Meter m)
    {
        instrumenter.add(m);
    }

    //Hent instrumenter
    public Meter getInstrument(String regNr)
    {
        for(Meter element : instrumenter)
        {
            if(element.getRegistreringsnummer().equals(regNr)){
                return element;
            }
        }
        return null;
    }
    
    //Hent alle instrumenter
    public Meter showAll()
    {
        for(Meter element : instrumenter)
        {
            return element;
        }
        return null;
    }

    //Slette instrument
    public boolean removeInstrument(String str)
    {
        Iterator<Meter> it = instrumenter.iterator();
        while(it.hasNext())
        {
            Meter meter = it.next();
            if(meter.getRegistreringsnummer().equals(str))
            {
                it.remove();
                return true;
            }
        }
        return false;
    }
    
    //Endre plassering
    public boolean updatePlassering(String regnummer, String plassering)
    {
        for(Meter element : instrumenter)
        {
            if(element.getRegistreringsnummer().equals(regnummer)){
                element.setPlassering(plassering);
                return true;
            }
        }
        return false;
    }
    
    //Endre status
    public boolean updateStatus(String regnummer, String status)
    {
        for(int i = 0; i > instrumenter.size(); i++)
        {
            if(instrumenter.get(i).getRegistreringsnummer().equals(regnummer)){
                instrumenter.get(i).setStatus(status);
                return true;
            }
        }
        return false;
    }
    
    //Print instrumenter
    public void printArray()
    {
        for(Meter element : instrumenter)
        {
            if(element instanceof Meter)
            {
                Meter m = (Meter) element;
                System.out.println(m.toString());
            }
        }
        
    }
}
