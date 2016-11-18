
public class Drivetrain {
	MotorModule motorOne;
	MotorModule motorTwo;
	//Initializes the 2 motors to port A and B
	public Drivetrain(){
		motorOne = new MotorModule(MotorPort.A);
		motorTwo = new MotorModule(MotorPort.B);
	}
	//Tells motor one to go foward
	//Tells motor two to go backwards
	public void Turn()
	{
		motorOne.RotateFoward();
		motorTwo.RotateBackward();
	}
	//Tell both motors to rotate fowards
	public void Foward()
	{
		motorOne.RotateFoward();
		motorTwo.RotateFoward();
	}
	//Tells both motors to rotate backwards
	public void Backward()
	{
		motorOne.RotateBackward();
		motorTwo.RotateBackward();
	}
	//Tells both motors to stop
	public void Stop()
	{
		motorOne.Stop();
		motorTwo.Stop();
	}

}
