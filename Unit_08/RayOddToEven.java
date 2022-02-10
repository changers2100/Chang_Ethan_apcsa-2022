//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	private int[] ray;
	
	public RayOddToEven()
	{
		setRay(new int[] {0, 0});
	}
	
	public RayOddToEven(int[] inputRay)
	{
		setRay(inputRay);
	}
	
	public void setRay(int[] inputRay) {
		ray = inputRay;
	}
	public int go(int[] ray)
	{
		int oddCount;
		int evenCount;
		for(int i = 0; i<ray.length; i++) {
			if(ray[i] %2 != 0) {
				oddCount = i;
				for(int even = i; even <ray.length; even++)
				{
					if(ray[even] %2 == 0) {
						evenCount = even;
						return evenCount-oddCount;
					}
				}
			}
		}
		return -1;
	}
}

//what does an array return if index is not in string -- -1?