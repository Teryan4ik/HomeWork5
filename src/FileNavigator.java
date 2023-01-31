import java.util.*;



public class FileNavigator {

    public static final Map<String, List<FileData>> fileNavigator = new HashMap<>();


    public static void add(FileData file) {
        Set<String> x = fileNavigator.keySet();
        if(file.getPath().equals(fileNavigator.containsKey(x)) ){
            System.out.println("Wrong path:" + file.getPath());
    }else {
            fileNavigator.computeIfAbsent(file.getPath(), s -> new ArrayList<FileData>()).add(file);
        }
    }

    public static List<FileData> find(String path) {
        return fileNavigator.values().stream().flatMap(Collection::stream).filter(file -> file.getPath() == path).toList();
    }

    public static List<FileData> filterBySize(int size) {
        return fileNavigator.values().stream()
                .flatMap(Collection::stream)
                .filter(file -> file.getSize() < size)
                .sorted(Comparator.comparingInt(FileData::getSize))
                .toList();
    }

    public static void remove(String path) {
        fileNavigator.remove(path);
    }

    public static List<FileData> sortBySize() {
        int size = 0;
        return fileNavigator.values().stream()
                .flatMap(Collection::stream)
                .filter(file -> file.getSize() > size)
                .sorted(Comparator.comparingInt(FileData::getSize))
                .toList();
    }
}
