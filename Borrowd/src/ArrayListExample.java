import java.util.*;
public class ArrayListExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter the Number of Elements: ");
		int l = sc.nextInt();
		for(int i=0; i<l; i++) {
			System.out.print("Enter the "+(i+1)+" Element: ");
			al.add(sc.nextInt());
		}
		System.out.print("Enter element to remove: ");
		int ele = sc.nextInt();
		int idx = al.indexOf(ele);
		al.remove(idx);
		System.out.println("Element Removed");
		System.out.println(al);
		System.out.print("Enter element to Replace: ");
		int toUpdate = sc.nextInt();
		System.out.print("Enter Updated element: ");
		int updated = sc.nextInt();
		int index = al.indexOf(toUpdate);
		al.set(index, updated);
		System.out.println(al);
		Iterator<Integer> itr = al.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.print("Enter the Index: ");
		int s = sc.nextInt();
		System.out.println("Element at index "+s+" "+al.get(s));
		Collections.sort(al);
		System.out.println("Sorted: " +al);
	}
}
