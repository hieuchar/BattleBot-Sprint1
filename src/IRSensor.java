import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;

public class IRSensor implements IRSensorInterface{

	private LightSensor sensor;
	public IRSensor(int port)
	{
		switch(port)
		{
		case 1:
			sensor = new LightSensor(SensorPort.S1);
			break;
		case 2:
			sensor = new LightSensor(SensorPort.S2);
			break;
		case 3:
			sensor = new LightSensor(SensorPort.S3);
			break;
		case 4:
			sensor = new LightSensor(SensorPort.S4);
			break;
		}
	}
	@Override
	public int GetReading() {
		// TODO Auto-generated method stub
		return sensor.readValue();
	}

}
