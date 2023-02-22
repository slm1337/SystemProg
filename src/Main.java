import java.io.File;
public class Main {
    public static void main(String[] args) {
        var pathToExecuteFile = new File("").getAbsolutePath();
        System.out.println(pathToExecuteFile);
        printAllFilesFromDirectory(new File(pathToExecuteFile), 0);
    }

    static String variableWithSpaces(int n) {
        return new String (new char[n]).replace("\0", "    ");
    }

    static void printAllFilesFromDirectory(File dir, int level){
        final String indent = variableWithSpaces(level);

        File[] list = dir.listFiles();
        if (list == null)
            return;

        for (File name : list) {
            if (name.isFile()){
                System.out.println(indent + name.getName());
            } else {
                System.out.println(indent + name.getName());
                printAllFilesFromDirectory(name, level + 1);
            }
        }
    }
}