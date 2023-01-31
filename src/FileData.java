public class FileData {
    public String name;
    public int size;
    public String path;


    public FileData(String name, int size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    @Override
    public String toString() {
        return "Path: " + this.path + ", name: " + this.name + ", size: " + this.size;
    }
}
