/**
 * Created by Josh on 4/18/2017.
 */
public class DirectionalSensor extends VelocitySensor
{
    private int direction = 0;
    @Override
    public void powerOn()
    {
        getDirection();
    }

    public int getDirection()
    {
        return direction;
    }
}
