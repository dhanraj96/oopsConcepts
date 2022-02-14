public class AccessModifier
{
	int nos;
	float hrs;
	int noc;
	void displayStudents()
	{
	system.out.println("Number of students");
}
void displayHours()
{
	system.out.println("Number of Hours");
}
void displayClass()
{
	system.out.println("Number of class");
}
public static void main(string[]args)
{
	AccessModifier am=new AccessModifier();
	am.displayStudents();
}
}