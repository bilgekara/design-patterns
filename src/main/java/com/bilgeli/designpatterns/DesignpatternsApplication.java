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

		/* List,Queue,Set
		   List : ArrayList, LinkedList
		   Queue: PriorityQueue, Dec<I>
		   Set  : HashSet, LinkedHashSet, TreeSet->SortedSet<I>

		   ArrayList vs LinkedList
		   - index kullandığı için istediğin elemanı bulmak çok kolay
		   - node yapısını kullanır(ilk bölümde datanın değeri, ikinci bölüm pointer)
		     index kullanmadığı için elemanı bulmak zordur

		   - bir elemanı çektiğinde geri kalan tüm indeksleri ayarlamak gerekiyor
		   - eleman ekleme ve çıkarma çok kolay

		   - eleman erişme O(1) || eleman arama O(n)
		   - eleman erişme O(n) || eleman arama O(n)

		   - memory overhead
		     arraylist daha fazla memory kullanıyor -> indexleme yüzünden

			** linkedlist ekleme çıkarma, arraylist arama, hashset ekleme arama -> performanslı

		    HashSet vs TreeSet
		    - tekrarlı eleman kabul edilmez

		    - elemanı sıraya koymaz
		    - elemanı doğal bir sıralamayla tutar ( o yüzden daha yavaş)
		    * eğer hashsetin yavaşlığını istemiyorsam ama sıralı veri istiyorsam;
		      elemanları hashset ile ekleyip, hashseti treesete dönüştürürüm

		    HashSet vs LinkedHashSet
		    - rastgele sırayla tutar-> sıralamayla zaman kaybetmez hızlıdır
		    - ekleme sırasına göre tutar -> o yüzden daha yavaş

		    --hashmap thread-safe değildir

		    HashSet -> elamanları hashleyip hashtable da ki ilgili bucket a ekliyor
		  		   sabit zamanda erişebiliyoruz
		 */


		/*
		soap : statefull(önceki durum hakkında bilgi sahibi
		       yavaş(daha geniş bant kullanır):sebebi xml
		       daha güvenilir
		rest : stateless
			   daha hızlı(daha düşük bant genişliği):json

		*Serileştirme, nesnenin durumunu bayt akışına dönüştürür ve bu akışı bir dosyaya yazar.
		Nesne daha sonra bu bayt akışından geri okunur.
		Bu yöntemle, nesnenin tüm durumu otomatik olarak korunur.

		serilization  -> java objesinin farklı bir data formatına çevrilmesi
		 				(bytelara çevrilmesi), (java objectini json tipine döndürmek)
		 				çevirmeyi yaptıktan sonra depolarız(file,db,memory)
		deserilization -> byte'ı java objesine çeviriyor

		->redisten bir datayı okurken o serailzble değilse hata verir cunku redis byte byte okur
		herkesin ortak okuyabileceği bir
		dosya işlemlerinde onu okuyamazsın
		 */

		/*
		* sql-> datalar arası çok fazla ilişki varsa, ilişkileri yönetmem gerekiyorsa
				verilerin önceden sınırları çizilmişse
		* nosql -> daha hızlı ve daha ölçeklenebilir
				   sürekli genişliyorsa daha esnek yapıda document base şeklinde tutulan
	    db ler tercihim olur

	    * ana sayfa fail oldu çok istek alan bi yer(circuit braker tanımlıyorsun)
	    * şu kadar hatadan sonra default bir cevap dön-> ama arka tarafta belli periyotlarla servise istek yolla
		* */

	}
}
