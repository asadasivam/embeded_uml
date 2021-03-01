/**
 * @author sadasivam
 * @version 1.0
 * @created 27-Feb-2021 8:43:42 PM
 */
package test;

public class WM {
	int engineOperation;
	public void spin()
	{
		int i = 0;
		for(i = 0;i<100;i++)
		{
			setEngine();	
		}		
	}
	public void setEngine()
	{
		engineOperation = 1;
	}
	public int getEngine()
	{
		return engineOperation;
	}
	public static void main(String[] args) {	
		//creating instance
		WM washingMachine 		= new WM();
		WashOption washOption 	= new WashOption();
		
		int return_val = washOption.getWashSelection();
		switch(return_val)
		{		
			case 1	: 	washingMachine.spin();
					 	break;
			default	: 	break;
		}
	}

}
