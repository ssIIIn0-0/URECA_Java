package iterator2;

public class Test {

	public static void main(String[] args) {
		
		StringContainer<String> container = new StringContainer<>();
		String[] strArray = {"Hello", "Iterator", "Patterns"};
		container.setArray(strArray);
		
		Iterator<String> iter = container.getIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		StringContainer<Integer> container2 = new StringContainer<>();
		Integer[] intArray = {1, 5, 2, 4};
		container2.setArray(intArray);
		
		Iterator<Integer> iter2 = container2.getIterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}

	}
}
