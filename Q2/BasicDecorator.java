public class BasicDecorator extends Decorator
{
    public BasicDecorator(AbstractVacationPackage thisPackage)
    {
	vacation = thisPackage;
	cost = 10 + vacation.cost;
    }

    @Override
    public void displayCost()
    {
	System.out.println("Cost: $" + cost);
    }

    @Override
    public void displayArrangements()
    {
	vacation.displayArrangements();
	System.out.print("Meal. ");
    }
}
