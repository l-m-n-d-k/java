package app;

import java.util.List;
import visitor.Element;
import visitor.Image;
import visitor.Paragraph;
import visitor.PrintVisitor;
import visitor.StatisticsVisitor;

public class VisitorDemo {
    public static void main(String[] args) {
        List<Element> document = List.of(
                new Paragraph("Паттерн Посетитель выносит операции в отдельные классы"),
                new Image("scheme.png", 800, 600),
                new Paragraph("Элементы документа не меняются"),
                new Image("photo.jpg", 1920, 1080));

        System.out.println("Вывод документа:");
        PrintVisitor printVisitor = new PrintVisitor();
        for (Element element : document) {
            element.accept(printVisitor);
        }

        System.out.println("\nСтатистика:");
        StatisticsVisitor statistics = new StatisticsVisitor();
        for (Element element : document) {
            element.accept(statistics);
        }
        statistics.printReport();
    }
}
