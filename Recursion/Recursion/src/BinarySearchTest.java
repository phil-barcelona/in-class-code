import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void test() {
		Integer[] list = {12, 13, 19, 23, 39, 498, 583, 679, 1001, 1003};
		int index = BinarySearch.search(list, 12, 0, list.length - 1);
		
		assertEquals(0, index);
		
		index = BinarySearch.search(list, 23, 0, list.length - 1);
		assertEquals(3, index);

		index = BinarySearch.search(list, 1003, 0, list.length - 1);
		assertEquals(9, index);
		
		index = BinarySearch.search(list, 77, 0, list.length - 1);
		assertEquals(-1, index);
	}

}
