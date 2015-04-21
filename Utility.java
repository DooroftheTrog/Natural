
public class Utility 
{
	public static Natural findMinimum(java.util.List<Natural> list)
	{
		int i=0;
		Natural min=list.get(i);
		i++;
		while(i<list.size())
		{
			if(min.intValue()>list.get(i).intValue())
			{
				min=list.get(i);
			}
			i++;
		}
		return min;
	}
	
	public static Natural findMinimum(java.util.List<Natural> list, java.util.Comparator<Natural> comparator)
	{
		int i=0;
		Natural min=list.get(i);
		i++;
		while(i<list.size())
		{
			Natural n = list.get(i);
			int swap = comparator.compare(min,n);
			if(swap>=1)
			{
				min=list.get(i);
			}
			i++;
		}
		return min;
	}
	
	public static Natural findMaximum(java.util.List<Natural> list)
	{
		int i=0;
		Natural max=list.get(i);
		i++;
		while(i<list.size())
		{
			if(max.intValue()<list.get(i).intValue())
			{
				max=list.get(i);
			}
			i++;
		}
		return max;
	}
	
	public static Natural findMaximum(java.util.List<Natural> list, java.util.Comparator<Natural> comparator)
	{
		int i=0;
		Natural max=list.get(i);
		i++;
		while(i<list.size())
		{
			int swap = comparator.compare(max, list.get(i));
			if(swap==-1)
			{
				max=list.get(i);
			}
			i++;
		}
		return max;
		
	}
}
