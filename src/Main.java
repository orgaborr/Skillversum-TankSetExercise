import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Tank> tanks = new HashSet<>();
		
		Tank tiger = new Tank();
		tiger.setId(11L);
		tiger.setName("Tiger");
		tiger.setCanonNumber(1);
		
		Tank sherman = new Tank();
		sherman.setId(123L);
		sherman.setName("Sherman");
		sherman.setCanonNumber(1);
		
		tanks.add(tiger);
		tanks.add(tiger);
		tanks.add(sherman);
		
		System.out.println(tanks.size());
		for(Tank tank : tanks) {
			System.out.println(tank.getName());
		}
	}
}
