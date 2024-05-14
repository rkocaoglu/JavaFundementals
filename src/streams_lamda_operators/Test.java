package streams_lamda_operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Aleyna"));
		users.add(new User(2, "Ahmet"));
		users.add(new User(3, "Zehra"));
		users.add(new User(4, "Murat"));
		users.add(new User(5, "Yıldız"));
		users.add(new User(6, "Levent"));
		users.add(new User(7, "Elvan"));
		// Lamda veya arrow funtion
		users.stream().forEach(user -> {
			user.talk();
		});

		users.stream().forEach(User::talk);
		long count = users.stream().filter(user -> user.id > 5).count();
		System.out.println("count" + count);

		List<User> filteredList = users.stream().filter(user -> user.id > 5).collect(Collectors.toList());
		System.out.println("Filtered");
		filteredList.stream().forEach(User::talk);

		List<User> mapList = users.stream().map(user -> new User(user.id + 10, user.name)).toList();
		System.out.println("Mapped List");
		mapList.stream().forEach(user -> System.out.println(user.id + " " + user.name));

		Map<Integer, String> userMap = users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));
		userMap.forEach((key, value) -> System.out.println(key + ":" + value));

	}

}
