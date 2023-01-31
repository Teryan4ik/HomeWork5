public class Main {


    public static void main(String[] args) {

        FileData file = new FileData("files.txt", 5, "/path/to/file");
        FileData file2 = new FileData("Main.txt", 71, "/path/another/");
        FileData file3 = new FileData("files.txt", 24, "/path/to/file");
        FileData file4 = new FileData(".gitignore", 55, "/path/another/");
        FileData file5 = new FileData(".gitignore", 0, "XXXXXX");

        FileNavigator.add(file);
        FileNavigator.add(file2);
        FileNavigator.add(file3);
        FileNavigator.add(file4);
        FileNavigator.add(file5);


        FileNavigator.filterBySize(100);
        FileNavigator.find("/path/to/file");
        FileNavigator.sortBySize();
        FileNavigator.remove("XXXXXX");

    }
}