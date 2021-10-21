package assignment6.collection;

//import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class CollectionMethodsExample
{

	public static void main(String[] args)
	{
		
		/* Create an items list */
		List<String> items = new ArrayList<>();
		
		/* Add to the list 5 values */
		items.add("Shoes");
		items.add("Toys");
		
		String[] newItems = {"Fruits", "Bat", "Mouse"};				// Way 1
		Collections.addAll(items, newItems);
		
		//items.addAll(Arrays.asList("Fruits", "Bat", "Mouse"));	// Way 2
		
		/* Sort the list and print them out each on a newline */
		Collections.sort(items);
		
		System.out.printf("List in default order\n");
		for (String item : items)
		{
			
			System.out.printf("%s\n", item);
			
		}
		
		System.out.printf("\n");
		
		/* Reverse the list and print out each on a newline */
		Collections.reverse(items);
		Iterator<String> iter = items.iterator();
		
		System.out.printf("List in reversed order\n");
		while (iter.hasNext())
		{
			
			System.out.printf("%s\n", iter.next());
			
		}

	}

}
