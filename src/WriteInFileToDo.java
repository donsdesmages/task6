import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteInFileToDo extends Collection {

    public void WriterFilesMethod() throws FileNotFoundException {

        try {
            File file = new File("/Users/vladimir/Desktop/SaveInfoForToDoList.txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(StringNames.morningWaterProcess);
            printWriter.println(GetLocalTimeForMorningDoWater1());
            printWriter.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException + "Адрес файла не найден");
        }
    }
    public void WritingFirstStringInFileTxt () {

        try {
            File file2 = new File("/Users/vladimir/Desktop/SaveInfoForToDoList.txt");
            PrintWriter printWriterForTxt = new PrintWriter(file2);
            printWriterForTxt.print(StringNames.messageForTxtFileWithGoodDay);
            printWriterForTxt.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException("Ошибка при записи");
        }
    }

}
