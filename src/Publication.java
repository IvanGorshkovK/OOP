import java.util.Objects;

public abstract class Publication implements Printable {
    private String title;
    private String author;
    private int year;
    private static int publicationCount = 0; // счетчик созданных публикаций


    // Создание конструктора, гетеров и сетеров
    public Publication(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;

    }

    public static int getPublicationCount() {
        return publicationCount;
    }

    //Метод увеличения счетчика публикаций
    public static void increasePublicationCount() {
        publicationCount++;
    }

    //
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Переопределение методов

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return year == that.year && Objects.equals(title, that.title) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public void printDetails() {
        System.out.println("Title:" +getTitle()+
                "\nAuthor: "+ getAuthor()+
                "nYear: "+ getYear());
    }
    public abstract String getType();
}
