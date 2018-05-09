import java.util.Iterator;

public class Main {
	public static final Integer LIST_SIZE = 5;
	
	public static final ArrayList<Integer> list = new ArrayList<>(LIST_SIZE);

	public static void main(String[] args) {

		// Instantiating the List Class by using polymorphism:
		ArrayList<String> list = new ArrayList<>(5);

		/**PROBLEM 1:
		 * Use an ArrayList class and build a test program that a) adds five
		 * user-defined names (e.g., “Alex,” “Tom,” “Brian,” “Cody,” and “Naomi.”), b)
		 * checks if any chosen name (e.g., “Alex”) is located, and c) if so returns
		 * such a name. Otherwise, this test program prints out that there is no such a
		 * name. You can use the List interface and the ArrayList class shown below.
		 **/

		// String[] names = { "ALex", "Tom", "Brian", "COdy", "Naomi" };
		list.add(0, "Alex");
		list.add(1, "Tom");
		list.add(2, "Brian");
		list.add(3, "Cody");
		list.add(4, "Naomi");

		System.out.println("The added names are: " + list);
		if (list.get(0) == "Alex") {
			System.out.println("The value: " + list.get(0) + " does exist!");
		} else {
			System.out.println("There is no such a name");
			return;
		}

		returnuserNums(10);
		returnErrorMessage();
		System.out.println("The output of the last result is: "+ trimToExactSize());

	}

	/**PROBLEM 2:
	 * Build another test program or combine this task with the previous program so
	 * that you can add 10 user-defined numbers (e.g., 0 through 9) in your
	 * ArrayList, b) check if any chosen numeric value (e.g., 10) is located, and c)
	 * if that is the case, the test program returns the chosen number. Otherwise,
	 * it should show that there is no such a number in the ArrayList. You can use
	 * the List interface and the ArrayList class shown below.
	 * 
	 */
	public static List<Integer> returnuserNums(int size) {
		List<Integer> numList = new ArrayList<>(size);
		for (int i = 0; i <= size; i++) {
			numList.add(i, i);
		}

		System.out.println("The number is: " + numList);
		return numList;

	}

	/** PROBLEM 3:
	 * Build the final test program that returns an error message in the case of
	 * going beyond the boundary. Say you ask for the 11th element in an ArrayList
	 * that contains only 10 elements. That should constitutes an error case and you
	 * expect your ArrayList to throw an exception in that case.
	 **/
	public static String returnErrorMessage() {
		String errorMessage = "The size of your list is larger than the allowed ";
		for (int i = 0; i < LIST_SIZE; i++) {
			
			list.add(i, i);
			list.add(i, ++i);
			

		}
		if (list.size() > LIST_SIZE) {
			
			System.out.println(errorMessage);
			
			
		}
		else {
		System.out.println(list);
		}
		return errorMessage;
	}

	/** PROBLEM 4:
	 * Let trimToExactSize() be a method that replaces the underlying array with one
	 * whose capacity precisely equals the number of elements currently in the list.
	 * You may test such a method using the List interface and the ArrayList class
	 * shown below. Your test program should be able to call this method after
	 * building an ArrayList class instance with a fixed size. Then, use either
	 * user-defined or pre-defined inputs for entered to the ArrayList instance.
	 */
	public static Integer trimToExactSize() {
		ArrayList<Integer> list2 = new ArrayList<>(5);
		list2.add(0, 3);
		list2.add(1, 300);
		list2.add(2, 3000);
		list2.add(3, 30000);
		list2.add(4, 300000);
		

		return list2.get(4);
	}
}
