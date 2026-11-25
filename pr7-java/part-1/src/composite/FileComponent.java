package composite;

public interface FileComponent {
    void add(FileComponent component);

    void display(int level);
}
