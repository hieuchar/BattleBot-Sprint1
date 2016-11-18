import java.util.ArrayList;

public class IRSensorModule {
	private IRSensor sensor;
	private ArrayList<LineFoundListener> listeners = new ArrayList<LineFoundListener>();
	public IRSensorModule(int port)
	{
		sensor = new IRSensor(port);
	}
	public void findLine()
	{
		for(;;)
		{
			evaluateReading(sensor.GetReading());		
		}
	}
	//Add a listener for the LineFound event
	public void AddLineListener(Robot r)
	{
		listeners.add(r);
	}
	public void evaluateReading(int reading)
	{
		if(reading > 65)
		{
			notifyListeners();
		}
	}
	public void notifyListeners()
	{
		for(LineFoundListener l : listeners)
		{
			l.LineFound();
		}
	}
}
