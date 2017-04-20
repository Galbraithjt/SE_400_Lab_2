/**
 * Created by Josh on 4/18/2017.
 */
public class VelocitySensor extends Sensor
{
    public VelocitySensor()
    {
        powerOn();
    }
    private double velocity = 0;

    @Override
    public void powerOn()
    {
        getVelocity();
    }

    public double getVelocity()
    {
        velocity = calculateVelocity();
        return velocity;
    }

    private double calculateVelocity()
    {
        SpeedSensor Speed = new SpeedSensor();
        DirectionalSensor Direction = new DirectionalSensor();
        double speed = Speed.getSpeed();
        double direction = Direction.getDirection();
        //velocity = some math to find velocity with speed and direction
        return velocity;
    }
}
