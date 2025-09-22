import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Publication> publications;

    public Library(List<Publication> publications) {
        this.publications = publications;
    }

    //Добавление публикации в каталог
    public void addPublication(Publication pub) {
        publications.add(pub);
    }
    // вывод всех публикаций
    public void listPublications(){
        publications.forEach(System.out::println);
    }

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
