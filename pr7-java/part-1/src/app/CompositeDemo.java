package app;

import composite.Directory;
import composite.FileComponent;
import composite.FileItem;

public class CompositeDemo {
    public static void main(String[] args) {
        Directory root = new Directory("home");
        Directory docs = new Directory("docs");
        Directory photos = new Directory("photos");
        Directory trip = new Directory("trip");

        docs.add(new FileItem("report.docx", 120));
        docs.add(new FileItem("notes.txt", 4));
        trip.add(new FileItem("beach.jpg", 2048));
        photos.add(new FileItem("me.png", 512));
        photos.add(trip);

        root.add(docs);
        root.add(photos);
        root.add(new FileItem("readme.md", 2));

        root.display(0);

        FileComponent file = new FileItem("single.txt", 1);
        try {
            file.add(new FileItem("other.txt", 1));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
