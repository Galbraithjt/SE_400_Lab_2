/**
 * Created by Josh on 4/18/2017.
 */
public class LocationSensor extends Sensor
{
    private double location = 0.0;

    public double getLocation()
    {
        location = calcualteLocation();
        return location;
    }

    private double calcualteLocation()
    {
        LightSensor LightSource = new LightSensor();
        GravitationalPullSensor GravitySensor = new GravitationalPullSensor();
        double light = LightSource.getLightDirection();
        double gravity = GravitySensor.getGravitationalConstant();
        //location = some math to calculate location based on light and gravity
        return location;
    }
}
