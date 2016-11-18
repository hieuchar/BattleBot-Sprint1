public class GroundManager {
	private Drivetrain dt;
	private IRSensorModule IRMod;
	
	//Initializes the instance variables
	public GroundManager()
	{
		dt = new Drivetrain();
		IRMod = new IRSensorModule(1);
	}
	//Turns the robot
	public void Turn()
	{
		dt.Turn();
	}
	//Drives the robot foward
	public void Foward()
	{
		dt.Foward();
	}
	//Drives the robot backward
	public void Backward()
	{
		dt.Backward();
	}
	//Stops the robot
	public void Stop()
	{
		dt.Stop();
	}
	public void AddLineListener(Robot r)
	{
		IRMod.AddLineListener(r);
	}
	
}
