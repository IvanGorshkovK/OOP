import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Publication> publications;

    public Library() {
        this.publications = new ArrayList<>();
    }

    //Добавление публикации в каталог
    public void addPublication(Publication pub) {
        publications.add(pub);
        Publication.increasePublicationCount();
    }
    // вывод всех публикаций
    public void listPublications(){
        publications.forEach(System.out::println);
    }

    // Поиск книги по автору
    public void searchByAuthor(String author){

        List<Publication> result = new ArrayList<>();// Создание вспомогательного массива

        for(Publication pub : publications){
            if(pub.getAuthor().equalsIgnoreCase(author)){
                result.add(pub);
            }
        }
        if(!result.isEmpty()){
            System.out.println("Вот что удалось найти " + result.toString());
        }else{
            System.out.println("Не удалось найти автора");
        }
    }

}
