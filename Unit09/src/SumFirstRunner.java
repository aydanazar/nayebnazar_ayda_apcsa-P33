import java.util.ArrayList;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{
		ListSumFirst test = new ListSumFirst();
		List<Integer> ray = new ArrayList<Integer>();
		
		ray.add(-99);
		ray.add(1);
		ray.add(2);
		ray.add(3);
		ray.add(4);
		ray.add(5);
		ray.add(6);
		ray.add(7);
		ray.add(8);
		ray.add(9);
		ray.add(10);
		ray.add(5);
		System.out.println(test.go(ray));
		ray.clear();
		
		ray.add(10);
		ray.add(9);
		ray.add(8);
		ray.add(7);
		ray.add(6);
		ray.add(5);
		ray.add(4);
		ray.add(3);
		ray.add(2);
		ray.add(1);
		ray.add(-99);
		System.out.println(test.go(ray));
		ray.clear();
		
		ray.add(32767);
		System.out.println(test.go(ray));
		ray.clear();
		
		ray.add(255);
		ray.add(255);
		System.out.println(test.go(ray));
		ray.clear();
		
		ray.add(9);
		ray.add(10);
		ray.add(-8);
		ray.add(10000);
		ray.add(-5000);
		ray.add(-3000);
		System.out.println(test.go(ray));
		ray.clear();
	}
}