
public class RepairableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank); 	// SCV�� Tank�� �����ϵ��� �Ѵ�.
		scv.repair(dropship);
//		scv.repair(marine); 	!error(Repairalbe) in SCV cannot be applied to (Marine)
	}

}
interface Repairalbe {}

class Unit	{
	int hitpoint;
	final int MAX_HP;
	Unit(int hp)	{
		MAX_HP = hp;
	}
	//...
}

class GroundUnit extends Unit {
		GroundUnit (int hp) {
			super(hp);
		}
}

class AirUnit extends Unit {
	AirUnit(int hp)	{
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairalbe {
	Tank() {
		super(150);	//Tank�� HP�� 150�̴�.
		hitpoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
	//...
}

class Dropship extends AirUnit implements Repairalbe {
	Dropship() {
		super(125);	// Dropship�� HP�� 125dlek.
		hitpoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
	//...
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitpoint = MAX_HP;
	}
	//...
}

class SCV extends GroundUnit implements Repairalbe {
	SCV() {
		super(60);
		hitpoint = MAX_HP;
	}


void repair(Repairalbe r)	{
	if (r instanceof Unit)	{
		Unit u = (Unit)r;
		while(u.hitpoint!=u.MAX_HP) {
			/* Unit�� HP�� ������Ų��. */
			u.hitpoint++;
		}
		System.out.println( u.toString() + "�� ������ �������ϴ�.");
	}
}
//...
}