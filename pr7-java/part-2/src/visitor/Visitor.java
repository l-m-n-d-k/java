package visitor;

public interface Visitor {
    void visit(Paragraph paragraph);

    void visit(Image image);
}
