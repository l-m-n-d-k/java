package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent {
    private String name;
    private List<FileComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void add(FileComponent component) {
        children.add(component);
    }

    @Override
    public void display(int level) {
        System.out.println("  ".repeat(level) + "+ " + name + "/");
        for (FileComponent child : children) {
            child.display(level + 1);
        }
    }
}
