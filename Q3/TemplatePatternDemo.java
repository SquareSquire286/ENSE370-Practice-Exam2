public class TemplatePatternDemo
{
    public static void main(String[] args)
    {
	Sport sport = new NHL();
	sport.streamNews();

	sport = new NBA();
	sport.streamNews();

	return;
    }
}
