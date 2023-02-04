import java.util.*;


public class FileNavigator {

    public static final Map<String, List<FileData>> fileNavigator = new HashMap<>();


    public static void add(FileData file, String path) {
        if (!Objects.equals(file.getPath(), path)) {
            System.out.println("In " + file.getName() + " wrong path: " + path);
        } else {
            fileNavigator.computeIfAbsent(file.getPath(), s -> new ArrayList<>()).add(file);
        }
    }

    public static List<FileData> find(String path) {
        return fileNavigator.values().stream().flatMap(Collection::stream).filter(file -> file.getPath().equals(path)).toList();
    }

    public static List<FileData> filterBySize(int size) {
        return fileNavigator.values().stream().flatMap(Collection::stream).filter(file -> file.getSize() < size).sorted(Comparator.comparingInt(FileData::getSize)).toList();
    }

    public static void remove(String path) {
        fileNavigator.remove(path);
    }

    public static List<FileData> sortBySize() {
        int size = 0;
        return fileNavigator.values().stream().flatMap(Collection::stream).filter(file -> file.getSize() > size).sorted(Comparator.comparingInt(FileData::getSize)).toList();
    }
}
