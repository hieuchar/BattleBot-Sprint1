

import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;

public class MotorModule implements MotorInterface{

	NXTRegulatedMotor motor;
	//Initializes the motor to the specified port
	public MotorModule(MotorPort p)
	{
		switch(p)
		{
		case A:
			motor = Motor.A;
			break;
		case B:
			motor = Motor.B;
			break;
		case C:
			motor = Motor.C;
			break;
		}
		//Sets the motor to maximum speed
		motor.setSpeed(motor.getMaxSpeed());
	}
	//Tells motor to go fowards
	@Override
	public void RotateFoward() {
		// TODO Auto-generated method stub
		motor.forward();
	}
	//Tells motor to go backwards
	@Override
	public void RotateBackward() {
		// TODO Auto-generated method stub
		motor.backward();
	}
	//Tells motor to stop
	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		motor.stop();
	}	

}
