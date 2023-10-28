import java.util.Scanner;
public class arvauspeliharjoitus {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String oikeaNimi = "Marko";
		String arvaus;
		
		while (true)
		{
			System.out.println ("Arvaa nimi");
			arvaus = in.nextLine();
		
			
			if (arvaus.equals(oikeaNimi))
			{
				System.out.println ("Onneksi olkoon, arvasit oikein!");
			break;
		}
			else 
			{
				System.out.println ("Arvasit v��rin, yrit� uudestaan.");
				System.out.println ("Arvaa nimi");
				arvaus = in.nextLine();
				
				if (arvaus.equals(oikeaNimi))
				{
					System.out.println ("Onneksi olkoon, arvasit oikein!");
			break;
		}
	}
		}
	}
}
System.out.println ("testataan gitia");
