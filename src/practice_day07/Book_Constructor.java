package practice_day07;

public class Book_Constructor {
    // Bir "Book" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, kitap adını, yazarını ve yayın yılını alacak şekilde tasarlanmalıdır.
// Örnek çıktı:
// Book nesnesi oluşturuldu: "Java Programlama" - Ahmet Bulutluöz (2021)
    String title;
    String yazar;
    int yayinYili;

    public Book_Constructor(String title, String yazar, int yayinYili){
        this.title=title;
        this.yazar=yazar;
        this.yayinYili=yayinYili;
    }

    public static void main(String[] args) {
        Book_Constructor bookConstructor =new Book_Constructor("Java Programlama","Ahmet Bulutluöz",2021);
        System.out.println("Yeni Kitap Eklendi:\n Kitap Bilgileri:\n"+ bookConstructor.title+"-"+ bookConstructor.yazar+"-"+ bookConstructor.yayinYili );
        Book_Constructor bookConstructor2 =new Book_Constructor("babayigit","java practice",2022);
        System.out.println("Yeni Kitap Eklendi:\n Kitap Bilgileri:\n"+ bookConstructor2.title+"-"+ bookConstructor2.yazar+"-"+ bookConstructor2.yayinYili );
    }
}
