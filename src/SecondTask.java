import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SecondTask {

	/**
	 *Write a generic method that takes an array of objects and a collection, and puts all objects in the array
	 * into the collection
	 */

	public static void main(String[] args) {

		//Create for example Humans

		Human first = new Human("Adam","male",220,175);
		Human second = new Human("Eva","women",220,167);
		Human third = new Human("Cain","male",90,178);
		Human fourth = new Human("Avel","male",90,172);


		//Create array of Humans and add Humans to array

		Human[] humanity = new Human[4];
		humanity[0] = first;
		humanity[1] = second;
		humanity[2] = third;
		humanity[3] = fourth;

		//Create collection of Humans

		ArrayList<Human> humanityCollection = new ArrayList<>();
		humanityCollection.add(new Human("Maria","women",27,155));
		humanityCollection.add(new Human("Jesus","male",1,76));


		//Completed collection

		List<Human> humans = combiningArrayWithCollection(humanity,humanityCollection);


		//For example print names

		for (Human human : humans) {
			System.out.println(human.getName());
		}

	}

	private static <T> List combiningArrayWithCollection(T[] o, Collection<T> collection){
		List<T> out = new ArrayList<>(Arrays.asList(o));
		out.addAll(collection);
		return out;
	}
}
