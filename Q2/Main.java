public class Main
{
    public static void main(String[] args)
    {
	AbstractVacationPackage vacation1 = new BasicDecorator(new NoFrillsDecorator(new VacationPackage()));
	System.out.println("Vacation 1:");
	vacation1.displayCost();
	vacation1.displayArrangements();
	System.out.println();

	AbstractVacationPackage vacation2 = new DeluxeDecorator(new BasicDecorator(new NoFrillsDecorator(new VacationPackage())));
	System.out.println("Vacation 2:");
	vacation2.displayCost();
	vacation2.displayArrangements();
	System.out.println();

	return;
    }
}
