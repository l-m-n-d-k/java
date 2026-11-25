package visitor;

public class StatisticsVisitor implements Visitor {
    private int paragraphs;
    private int images;
    private int words;

    @Override
    public void visit(Paragraph paragraph) {
        paragraphs++;
        String text = paragraph.getText().trim();
        if (!text.isEmpty()) {
            words += text.split("\\s+").length;
        }
    }

    @Override
    public void visit(Image image) {
        images++;
    }

    public void printReport() {
        System.out.println("Абзацев: " + paragraphs);
        System.out.println("Изображений: " + images);
        System.out.println("Слов: " + words);
    }
}
