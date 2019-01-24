package Custom.MyArrayLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyArrayListTest {
	MyArrayList<GameLib> arr = new MyArrayList<GameLib>();

	@Test
	public void testRemove() {
		
		
		
		arr.Add(new GameLib("COD","FPS","Activision",60));
		arr.Add(new GameLib("BF","FPS","EA",70));
		arr.Add(new GameLib("R6S","FPS","UBI",30));
		GameLib gg = new GameLib("COD","FPS","Activision",60);
		
		arr.Remove(2);
		assertEquals(arr.Size(),2);
	}

	

	@Test
	public void testGet() {
		
		arr.Add(new GameLib("COD","FPS","Activision",60));
		arr.Add(new GameLib("BF","FPS","EA",70));
		arr.Add(new GameLib("R6S","FPS","UBI",30));
		GameLib gg = new GameLib("COD","FPS","Activision",60);
		
		assertEquals(arr.get(0).ToString(),gg.ToString());

		
	}
	
	@Test
	public void testAdd()
	{
		arr.Add(new GameLib("COD","FPS","Activision",60));
		arr.Add(new GameLib("BF","FPS","EA",70));
		arr.Add(new GameLib("R6S","FPS","UBI",30));
		GameLib gg = new GameLib("COD","FPS","Activision",60);
		
		assertEquals(arr.Size(),3);
	}
	
	

}
