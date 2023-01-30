package file;

import java.util.ArrayList;
import java.util.Objects;

public class FileData {
    public String name;
    public String size;
    public String path;

    public static ArrayList<String> fileData = new ArrayList<>();


    public FileData(String name, String size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
        fileData.add(this.path);
        fileData.add(this.name);
        fileData.add(this.size);

    }
}
