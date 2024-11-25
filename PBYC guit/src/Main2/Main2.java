package Main2;
import EMPandManager.*;

public class Main2 {
public static void main(String[] args) {
	Emp emp=new Emp();
	Manager manager=new Manager();
	System.out.println(emp.CalSal(1000));
	System.out.println(manager.CalSalBonus(100, 200));
}
}
