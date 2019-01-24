package Custom.MyArrayLists;

import junit.framework.TestCase;

public class AddTest extends TestCase {
	
	MyArrayList<GameLib> arr = new MyArrayList<GameLib>();
	
	public void Test() {
	arr.Add(new GameLib("COD","FPS","Activision",60));
	GameLib gg = new GameLib("COD","FPS","Activision",60);
	
	 assertEquals(arr.toString(),gg.ToString());
	}
	

	

	
}
