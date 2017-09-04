package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSort {
	private static class Employee {
		public String name;

		public Employee(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return name;
		}
	}

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();
		Employee e1=new Employee("jay");
		Employee e2=new Employee("shankar");
		Employee e3=new Employee("prasad");
		Employee e4=new Employee("akela");
		
		map.put(1,e1);
		map.put(5,e2);
		map.put(4,e3);
		map.put(2,e4);

		List<Entry<Integer, Employee>> list = new ArrayList<Entry<Integer, Employee>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer, Employee>>() {

			@Override
			public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {

				return o1.getValue().name.compareTo(o2.getValue().name);
				//return o1.getKey().compareTo(o2.getKey());
			}

		});
		System.out.println(list);

	}
}
/* Output:
   1.[2=akela, 1=jay, 4=prasad, 5=shankar]
   2.[1=jay, 2=akela, 4=prasad, 5=shankar]
 * */
