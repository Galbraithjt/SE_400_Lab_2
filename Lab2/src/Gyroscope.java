/**
 * Created by Josh on 4/18/2017.
 */
public class Gyroscope extends SpeedSensor
{
    private int orientation = 0;

    @Override
    public void powerOn()
    {
        getOrientation();
    }

    public int getOrientation()
    {
        return orientation;
    }
}
