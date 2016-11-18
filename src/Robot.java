
public class Robot implements LineFoundListener {

	private GroundManager gm;
	//Constructs the robot and initializes all the instance variables
	public static void main(String[]args)
	{
		Robot r = new Robot();
		r.Start();
	}
	public Robot()
	{
		gm = new GroundManager();
		gm.AddLineListener(this);		
		
	}
	public void Start()
	{
		
	}
	@Override
	public void LineFound() {
		// TODO Auto-generated method stub
		gm.Stop();
		gm.Backward();
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gm.Turn();
	}
}
