public class Main {


    public static void main(String[] args) {

        FileData file = new FileData("files.txt", 5, "/path/to/file");
        FileData file2 = new FileData("Main.txt", 71, "/path/another/");
        FileData file3 = new FileData("book.txt", 24, "/path/to/file");
        FileData file4 = new FileData(".gitignore", 55, "/path/another/");
        FileData file5 = new FileData("project", 1, "XXXXXX");

        FileNavigator.add(file, file.getPath());
        FileNavigator.add(file2, "/path/");
        FileNavigator.add(file2, file2.getPath());
        FileNavigator.add(file3, file3.getPath());
        FileNavigator.add(file4, file4.getPath());
        FileNavigator.add(file5, file5.getPath());

        FileNavigator.filterBySize(100);
        FileNavigator.find("/path/to/file");
        FileNavigator.sortBySize();
        FileNavigator.remove("XXXXXX");
    }
}