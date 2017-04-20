/**
 * Created by Josh on 4/18/2017.
 */
import java.util.Random;
public class main
{
    public static void main(String args[])
    {
        Sensor [] sensorList = new Sensor[10];
        Random rndNumber = new Random();

        for(int flc = 0; flc < sensorList.length; flc++)
        {
            int rnd = rndNumber.nextInt(2) + 1;

            if(rnd == 1)
            {
                sensorList[flc] = new VelocitySensor();
            }
            if(rnd == 2)
            {
                sensorList[flc] = new LocationSensor();
            }
        }
    }
}
