/**
 * Created by Josh on 4/18/2017.
 */
public abstract class Sensor implements PowerSwitch
{
    @Override
    public void powerOn()
    {
       LocationSensor location =  new LocationSensor();
       VelocitySensor velocity = new VelocitySensor();
       System.out.printf("Current velocity is %f.2, and current location is %f.2", velocity, location);
    }
    @Override
    public void powerOff()
    {

    }
}
