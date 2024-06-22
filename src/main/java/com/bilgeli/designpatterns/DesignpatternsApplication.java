package com.bilgeli.designpatterns;

public class DesignpatternsApplication {
	public static void main(String[] args) {
		/* INHERITANCE
		 - reusable kodlar yazmamızı sağlıyor: kod tekrarını azaltıyor
		 - modularity and organization: bir hiyerarşi sunar bize
		 (birbiriyle alakalı classların bir parent altında toplanması)
		 - polymorphism: inheritance sayesinde kullanabiliyoruz
		 (inherit alan classlar kendilerine göre özelleştirebiliyor)
		 - maintenance and update
		 - code extensibility
		 -----------------------------------
		 ** sadece bir class extend edilir:
		 classların metotları var, uygulayan sınıfın kafası karışır
		 -Class'larda: Java, çoklu kalıtımı desteklemez çünkü aynı isimdeki metotların
		 hangi sınıftan miras alınacağını belirlemek zor ve kafa karıştırıcı olabilir.
		 -Interface'lerde: Çoklu kalıtım benzeri bir yapı mümkündür, çünkü
		 interface'lerde metot gövdeleri yoktur (Java 8 öncesi) ve
		 Java 8 ile gelen default metotlarda bile çakışma durumlarında override yaparak bu sorun çözülebilir.
		*/

		/* POLYMORPHISM
		 (iki şekilde uygulanır)

		 Overriding(dynamic or run-time) : parentte aki uygulamayı kendine göre özelleştirip kullanmaya
		 metodun body si değiştirilir(isme ve paremetrelere dokunulmaz
		 - parent public se child public olabilir default>protected

		 Overloading(static or compile-time) : ismi değişmez, parametresi değişir
		 - tek bir classın içinde olur
		*/

		/* ENCAPSULATION

		 iç detayları saklamanızı sağlar
		 fieldımı gizli tutup metotlar ile dışarı açıyorum
		 - data hiding
		 - data protection
		 - code flexibility:
		   * class'ımın davranışını setterlar ile değiştirebilirim
		     verinin korunması ve kontrollu erişimle ilgili
				teacher class'ı oluşturuldu, matematik teacher'ı üretilecek
		   		setter ile matematiği->fene feni->türkçeye
		   		bir obje ürettin setterla o objeyi fen öğretmeni yaptın
		   		bir kalıp sana matematik öğretmeni de veriyor, fen öğretmeni de veriyor
		   esnek bir kod yazmış oluyoruz
		- code maintainability
		 */

		/* ABSTRACTION

		 implementasyon detaylarını kullanıcıdan gizler
		 interfaceler ve abstract class lar ile sağlanır
		 bir metodu abstract yaptığımızda mecburi yapmış oluyoruz
		 * interface ten obje üretemezsin: içinde bir sürü abstract metot var
		   abstract metotlar tamamlanmamış metotlar
		   tamamlanmamış bir yapıyı içinde barındıran bir kalıpla obje üretilirse eksik bir obje olur
		   - public+abstract
		   - interfacete ki variablelar final(değer ataması yapmak zorundasın) + static
		 */

		/* ABSTRACT VS INTERFACE
		- abstract  : abstract ve concrete metotlar
		- interface : only abstract ( java 8 den sonra gövdeli metotlar var, default ve static ile)

		- abstract  : her tür variable
		- interface : public + final + static

		* ikisinden de obje üretielemez

		- abstract  : multiple inheritance'ı desteklemez
		- interface : birden fazla parent olabilir(bu yüzden oluşturulmuş)

		- abstract  : hem kullanılması zorunlu metotları hem de isteğe bağlı metotları
		- interface : hepsi zorunlu

		- abstract  : davranış tutar
					  (ortak yapılacak işlemleri yazabiliriz) -> template pattern
		- interface : yapılabilirlik sağlar
		 */

	}
}
