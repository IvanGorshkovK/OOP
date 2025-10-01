
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;




        while(flag){
            menu();
            System.out.println("Выберите пункт меню");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Введите тип публикации: 1 - Книга , 2 - Магазин , 3 - Газета");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Введите название ");
                    String title = scanner.nextLine();

                    System.out.println("Введите автора ");
                    String author = scanner.nextLine();

                    System.out.println("Введите год ");
                    int year = scanner.nextInt();
                    scanner.nextLine();


                    if(type == 1){
                        System.out.println("Введите ISBN");
                        String ISBN = scanner.nextLine();
                        library.addPublication(new Book(title,author,year,ISBN));
                    }else if(type == 2){
                        System.out.println("Введите issueNumber");
                        int issueNumber = scanner.nextInt();
                        library.addPublication(new Magazine(title,author,year,issueNumber));
                    }else if(type == 3){
                        System.out.println("Введите publicationDay");
                        String publicationDay = scanner.nextLine();
                        library.addPublication(new Newspaper(title,author,year,publicationDay));
                    }
                    break;
                case 2 :
                    library.listPublications();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Введите Автора для поиска");
                    String searchAuthor = scanner.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;
                case 4:
                    System.out.println("Количство публикаций: " + Publication.getPublicationCount());
                    break;
                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Выберите пункт от 1 до 5");
            }
        }


    }
    public static  void menu(){
        System.out.println("Опция 1: Добавить новую публикацию" +
                "\nОпция 2: Вывести список всех публикаций" +
                "\nОпция 3: Поиск публикации по автору" +
                "\nОпция 4: Вывести общее количество публикаций (используя статический метод)." +
                "\nОпция 5: Выход.");
    }
}



