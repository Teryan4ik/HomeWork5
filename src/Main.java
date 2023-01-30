import file.FileData;
import file.FileData.*;
import file.FileNavigator;
import file.FileNavigator.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static file.FileData.*;
import static file.FileNavigator.add;
//import static file.FileNavigator.find;
import static file.FileNavigator.fileNavigator;

public class Main {


    public static void main(String[] args) {


        FileData file = new FileData("files.txt", "5", "/path/to/file");
        FileNavigator navi = new FileNavigator(FileData.fileData);
        add(FileData.fileData);
        FileData file2 = new FileData("project.txt", "15", "/path/to/file");
//        add(FileData.fileData);

        add(FileData.fileData);
//        find();

        System.out.println(file+" file");
        System.out.println(navi+" navi");
        System.out.println(FileData.fileData+" fileData");
        System.out.println(FileNavigator.fileNavigator+"  fileNavigator");


    }
}