package file;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FileNavigator {
    public String path;
    public static final Map<String, ArrayList<String>> fileNavigator = new HashMap<>();

    public FileNavigator(ArrayList<String> fileData) {
        this.path = path;
    }


    public static Map<String, ArrayList<String>> add(ArrayList<String> fileData) {
        if (fileNavigator.containsKey(fileData.get(0))) {
            fileNavigator.get(fileData.get(0)).add(fileData.get(1));
            fileNavigator.get(fileData.get(0)).add(fileData.get(2));

        } else {
            fileNavigator.put(fileData.get(0), new ArrayList<>());
            fileNavigator.get(fileData.get(0)).add(fileData.get(1));
            fileNavigator.get(fileData.get(0)).add(fileData.get(2));
        }
        fileData.clear();
        return fileNavigator;
    }

//    public static ArrayList<String> find(Map<String, ArrayList<String>> fileNavigator) {
//        String name = String.valueOf(fileNavigator.get("key"));
//        String name = fileNavigator.get("key",fileNavigator));
//        String name = fileNavigator.getOrDefault(key,fileNavigator);

//        if (fileNavigator.containsKey(name)) {
//            System.out.println(name + " number:" + fileNavigator.get(name).get(0));
//        } else {
//            System.out.println("null");
//        }
//        return fileNavigator.get(name);
//        return null;
//    }

    public static ArrayList<String> findAll(String name) {
        if (fileNavigator.containsKey(name)) {
            System.out.println(name + " numbers found:" + fileNavigator.get(name));
        } else {
            System.out.println("null");
        }
        return fileNavigator.get(name);
    }

}
