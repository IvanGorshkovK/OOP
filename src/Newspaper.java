import java.util.Objects;

public class Newspaper extends  Publication {
    private String publicationDay;

    public Newspaper(String title, String author, int year, String publicationDay) {
        super(title, author, year);
        this.publicationDay = publicationDay;
    }

    public String getPublicationDay() {
        return publicationDay;
    }

    public void setPublicationDay(String publicationDay) {
        this.publicationDay = publicationDay;
    }

    @Override
    public String getType() {
        return "Type Newspaper";
    }

    @Override
    public void printDetails() {
        System.out.println("Type: " + getType()+
                "\nTitle: "+getTitle()+
                "\nAuthor: " +getAuthor()+
                "\nYear: "+ getYear()+
                "\npublicationDay " +getPublicationDay());
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "publicationDay='" + publicationDay + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Newspaper newspaper = (Newspaper) o;
        return Objects.equals(publicationDay, newspaper.publicationDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), publicationDay);
    }
}
