/**
 * Created by Josh on 4/18/2017.
 */
public class Accelerometer extends SpeedSensor
{
    private double acceleration = 0;
    @Override
    public void powerOn()
    {
        getSpeed();
    }
    public double getAcceleration()
    {
        return acceleration;
    }
}
