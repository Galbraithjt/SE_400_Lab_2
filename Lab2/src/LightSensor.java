/**
 * Created by Josh on 4/18/2017.
 */
public class LightSensor extends LocationSensor
{
    private int lightDirection = 0;

    @Override
    public void powerOn()
    {
        getLightDirection();
    }

    public int getLightDirection()
    {
        return lightDirection;
    }
}
