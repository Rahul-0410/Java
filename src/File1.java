
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class File1 {
    // java.nio & java.io two files for file handling
    //java.nio has path class i.relative oath ii. absolute path
//     absolut_e path is the path which has C:\ or D:\ and for linux we have root
  public static  void main(String [] args){

    try{
        File file=new File("example.txt");

        boolean created=file.createNewFile();
        if(created){
            System.out.println("created");
        }
//        FileWriter writer=new FileWriter(file);
        //for appending
        FileWriter writer=new FileWriter(file,true);
        writer.write("import java.io.*;\n" +
                "import java.io.File;\n" +
                "import java.io.FileWriter;\n" +
                "import java.io.FileReader;\n" +
                "import java.io.IOException;\n" +
                "public class File1 {\n" +
                "    // java.nio & java.io two files for file handling\n" +
                "    //java.nio has path class i.relative oath ii. absolute path\n" +
                "//     absolut_e path is the path which has C:\\ or D:\\ and for linux we have root\n" +
                "  public static  void main(String [] args){\n" +
                "\n" +
                "    try{\n" +
                "        File file=new File(\"example.txt\");\n" +
                "\n" +
                "        boolean created=file.createNewFile();\n" +
                "        if(created){\n" +
                "            System.out.println(\"created\");\n" +
                "        }\n" +
                "//        FileWriter writer=new FileWriter(file);\n" +
                "        //for appending\n" +
                "        FileWriter writer=new FileWriter(file,true);\n" +
                "        writer.write(\"\\n I am fine\");\n" +
                "        writer.close();\n" +
                "\n" +
                "        FileReader reader=new FileReader(file);\n" +
                "        int n;\n" +
                "        System.out.println(\"Reading the file\");\n" +
                "        while((n=reader.read())!=-1){\n" +
                "            System.out.print((char)n);\n" +
                "        }\n" +
                "        reader.close();\n" +
                "    } catch (IOException e){\n" +
                "\n" +
                "        System.out.println(\"error caught\");\n" +
                "    }\n" +
                "//    System.out.println(file.canRead());\n" +
                "//      System.out.println(file.canWrite());\n" +
                "//      System.out.println(file.getAbsoluteFile());\n" +
                "//      System.out.println(file.length());\n" +
                "//      System.out.println(file.getName());\n" +
                "//      System.out.println(file.delete());\n" +
                "\n" +
                "    }\n" +
                "}");
        writer.close();

        FileReader reader=new FileReader(file);
        int n;
        System.out.println("Reading the file");
        while((n=reader.read())!=-1){
            System.out.print((char)n);
        }
        reader.close();
    } catch (IOException e){

        System.out.println("error caught");
    }
//    System.out.println(file.canRead());
//      System.out.println(file.canWrite());
//      System.out.println(file.getAbsoluteFile());
//      System.out.println(file.length());
//      System.out.println(file.getName());
//      System.out.println(file.delete());

    }
}
