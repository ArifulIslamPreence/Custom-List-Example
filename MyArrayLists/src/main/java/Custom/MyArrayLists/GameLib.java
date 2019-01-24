package Custom.MyArrayLists;

public class GameLib {
	
	private String name;
	private String genre;
	private String publisher;
	private double price;
	
	public GameLib(String name, String genre, String publisher, double price)
	{
		this.name = name;
		this.genre = genre;
		this.publisher = publisher;
		this.price = price;
	}
	
	public String ToString()
	{
		return "Game name = "+name+", Game genre = "+genre+", Publisher =  "+publisher+", Game Price(USD) = "+price;
	}
	
	public static void main(String args[])
	{
		/*GameLib gg = new GameLib("abc", "xyz", "asdf", 50);
		
		MyArrayList<GameLib> mm = new MyArrayList<GameLib>();
		
		mm.add(new GameLib("call of duty","fps","activision",60));
		
		System.out.print(mm.toString());*/
		
	}
	
	
	

}

