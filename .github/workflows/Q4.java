public class Q4
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);

		for (int i = n; i >= 1; i--)
		{
			for (int j = i; j >= 1; j--)
			{
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
