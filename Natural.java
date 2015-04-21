import java.util.Comparator;


public class Natural extends java.lang.Object implements Comparable<Natural> 
{
	private int val;

	public Natural(int value)
	{
		if(value<0)
		{
			throw new RuntimeException();
		}else{
			val = value;
		}
	}
	
	public int intValue()
	{
		return val;
	}
	
	@Override
	public int compareTo(Natural o) 
	{
		
		if(o.intValue()==this.val)
		{
			return 0;
		}else if(o.intValue()>this.val)
		{
			return -1;
		}else{
			return 1;
		}
	}
	
	public boolean equals(java.lang.Object obj)
	{
		if(obj instanceof Natural)
		{
			Natural temp = (Natural)obj;
			if(this.val==temp.intValue())
			{
				return true;
			}else{
				return false;
			}
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	public java.lang.String toString()
	{
		String value=Integer.toString(val);
		return value;
	}
	
	public static java.util.Comparator<Natural> comparatorByNumber()
	{
		class NaturalComp implements Comparator<Natural>
		{
			@Override
			public int compare(Natural nat1, Natural nat2)
			{						
				return nat1.compareTo(nat2);
			}
		}
		
		Comparator<Natural> comp = new NaturalComp();
		return comp;
	}
	
	public static java.util.Comparator<Natural> comparatorByAlpha()
	{
		class NaturalComp implements Comparator<Natural>
		{
			@Override
			public int compare(Natural nat1, Natural nat2)
			{					
				String n1 = nat1.toString();
				String n2 = nat2.toString();
				return n1.compareTo(n2);
			}
		}
		Comparator<Natural> comp = new NaturalComp();
		return comp;
		
	}

}
