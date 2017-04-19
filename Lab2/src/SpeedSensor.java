/**
 * Created by Josh on 4/18/2017.
 */
public class SpeedSensor extends VelocitySensor
{
    private double speed = 0.0;

    @Override
    public void powerOn()
    {
        getSpeed();
    }

    public double getSpeed()
    {
        speed = calculateSpeed();
        return speed;
    }

    private double calculateSpeed()
    {
        Accelerometer Acceleration = new Accelerometer();
        Gyroscope Orientation = new Gyroscope();
        double acceleration = Acceleration.getAcceleration();
        double orientaion = Orientation.getOrientation();
        //speed = some math to calculate speed based on acceleration and orientation
        return speed;
    }
}
