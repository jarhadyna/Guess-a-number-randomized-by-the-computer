import java.util.Random;
import java.util.Scanner;

public class Odgadywanie_Liczby_Wylosowanej_Przez_Komputer {

	public static void main(String[] args) {
		
		System.out.println("Komputer wylosowa³ liczbê w przedziale od 1 do 100.");
		
		int liczba, strzal=0, ile_prob=0;
		
		Random random=new Random();
		 liczba=random.nextInt(100)+1;

		while(strzal!=liczba)
		{
			ile_prob++;
			System.out.println("Zgadnij jaka to liczba (to Twoja "+ile_prob+"próba):");
			Scanner skaner=new Scanner(System.in);
			strzal=skaner.nextInt();
			
			if(strzal==liczba){
				System.out.println("Uda³o siê! Wygrywasz w "+ile_prob+" próbie. ");
			}
			
			else if(strzal<liczba){
				System.out.println("To za malo");
			}
			
			else if(strzal>liczba){
				System.out.println("To za du¿o");
			}
		}
		}
	}
	