package lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ThreadProgram
{
	public static void main(String[] args)
	{
		Consumer<Integer> display = (i)->System.out.println(i);
		List<Integer> li = new ArrayList<>();
		li.add(198);
		li.add(287);
		li.add(387);
		li.add(409);
		li.add(57);
		
		for (Iterator<Integer> iterator = li.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			display.accept(integer);
		}
		Thread lambdaThread=new Thread();
		lambdaThread.run();	
	}
}