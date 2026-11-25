package visitor;

public class PrintVisitor implements Visitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Абзац: " + paragraph.getText());
    }

    @Override
    public void visit(Image image) {
        System.out.println("Изображение: " + image.getFileName()
                + " (" + image.getWidth() + "x" + image.getHeight() + ")");
    }
}
