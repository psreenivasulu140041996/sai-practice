import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class unique {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 2, 5, 4, 8, 7, 8, 9, 6, 3, 2 };

		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(arr[i]);
			}
		}
	}

}
