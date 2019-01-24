package Custom.MyArrayLists;

import java.util.Arrays;

public class MyArrayList<E> {

	private int size;
	private static final int DEFAULT_CAPACITY = 1;
	
	private Object element[];
	
	
	public MyArrayList() 
	{
		element = new Object[DEFAULT_CAPACITY];
	
	}
	
	public void IncreaseSize()
	{
		int newsize = element.length * 2;
		element =Arrays.copyOf(element,newsize);
		
	}
	
	public void Add(E e)
	{
		if(size == element.length)
		{
			IncreaseSize();
		}
		element[size++] = e;
	}
	
	public E get(int i)
	{
		if(i>=size || i<0)
		{
			throw new IndexOutOfBoundsException("Index = "+ i + "is invalid");
		}
		
		
		return (E) element[i];
	}

	public E Remove(int i)
	{
		if(i>=size || i<0)
		{
			throw new IndexOutOfBoundsException("Index = "+ i + "is invalid");
		}
		
		Object removedElement =  element[i];
		
		int ListSize = element.length - (i+1);
		System.arraycopy(element, i+1, element, i, ListSize);
		size--;
		return (E) removedElement;
	
	}
	
	public int Size()
	{
		return size;
	}
	
	public Object UpdateElement(int i)
	{
		if(i>=size || i<0)
		{
			throw new IndexOutOfBoundsException("Index = "+ i + "is invalid");
		}
		Object UpdatedElement = element[i];
		return UpdatedElement;
		
	}
	
	public int IndexOf(Object ee)
	{
		int len = element.length;
		int value = 0;
		
		for(int index = 0; index<=len;index++)
		{
			if(ee == element[index] )
			{
				value = index;
			}
		}
		return value;
		
	}
	
	
	

}
