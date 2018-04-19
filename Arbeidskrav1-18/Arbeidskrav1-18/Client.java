
/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client
{
    public MeterArchive meterArchive;
    
    /**
     * Constructor for objects of class Client
     */
    public Client()
    {   
        mainMethod();
    }

    public void mainMethod()
    {
        if(meterArchive == null)
        {
            meterArchive = new MeterArchive();
            Clock c = new Clock("C2000", "R101H3", "i orden", 1.0);
            Weight w = new Weight("W1000","R101H5","i orden",0.01,4.1);
            Thermometer t = new Thermometer("T2000","R101H9","i orden",1.0,100.0);
            meterArchive.addInstrument(c);
            meterArchive.addInstrument(w);
            meterArchive.addInstrument(t);
            meterArchive.updatePlassering("C2000", "R");
            meterArchive.printArray();
        }
    }

}
