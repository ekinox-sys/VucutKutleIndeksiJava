package ilkelDegiskenler;
import java.util.Scanner;

public class MainSinifim {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //Scanner'ı tanımlıyoruz.
		
		System.out.print("Lütfen kilonuzu giriniz(kg):");// Burada ise kullanıcıdan input alarak boy ve kilosunu alıyoruz.
		int kilo = scanner.nextInt();
		System.out.print("Lütfen boyunuzu giriniz:(m): ");
		double boy = scanner.nextDouble();
		
		double bmi = kilo / (boy*boy); //Burda da aldığımız bilgiler ile boy kilo kütlesinin indeksini çıkarıyoruz.
		System.out.println("Boy kilo kütleniz: " + bmi);
		
		if (bmi<18.5) // Buradan sonrasın da if else koşullu ifadelerini kullanıp boy ve kilosuna göre durum belirliyoruz.
		{
			System.out.print("Sonuç: Zayıf");
		}
		else if ((bmi>=18.5) && (bmi<=25))
		{
			System.out.print("Sonuç: Normal");
		}
		else if ((bmi>=25)  && (bmi<=30))
		{
			System.out.print("Sonuç: Kilolu");
		}
		else if (bmi>=30)
		{
			System.out.print("Sonuç: Obez");
		}
		else {
			System.out.print("Lütfen geçerli bir boy kütle indeksi girin.");
		}
  }
}
 
 // Tamamen yardım amaçlı bir paylaşıyorum, java öğrenmeye başlayalı iki gün oldu ve içimden izlediğim eğitim serisinde ki quizi paylaşmak geldi. 
 // Uzun zamandır paylaşım yapmıyorum ayrıca, tazelemek adına böyle bir şey paylaşıyorum.
