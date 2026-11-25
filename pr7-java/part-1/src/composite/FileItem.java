package composite;

public class FileItem implements FileComponent {
    private String name;
    private int sizeKb;

    public FileItem(String name, int sizeKb) {
        this.name = name;
        this.sizeKb = sizeKb;
    }

    @Override
    public void add(FileComponent component) {
        throw new UnsupportedOperationException("В файл нельзя добавить вложенный элемент: " + name);
    }

    @Override
    public void display(int level) {
        System.out.println("  ".repeat(level) + "- " + name + " (" + sizeKb + " КБ)");
    }
}
