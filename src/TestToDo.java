
import java.io.FileNotFoundException;

public class TestToDo extends Collection  {

    public static void main(String[] args) throws FileNotFoundException {

        class Write {
            public void Method () throws FileNotFoundException {
                WriteInFileToDo writeInFileToDo1 = new WriteInFileToDo();
                writeInFileToDo1.WritingFirstStringInFileTxt();
            }
        }
        Write write = new Write();
        write.Method();

        class Print {

            public void PrintingMenu () {
                StringNames.printMenu();
                StringNames.printForiMenu();
                System.out.println();
                StringNames.namesToDo();
            }
        }
        Print print = new Print();
        print.PrintingMenu();

        class Scan {
            public void Command1 () {
                ScannerCommandsForConsole scannerCommandsForConsole = new ScannerCommandsForConsole();
                scannerCommandsForConsole.ScannerForGetFirstCommand();
            }
        }
        Scan scan = new Scan();
        scan.Command1();

        class Scan2 {
            public void Command2 () {
                ScannerCommandsForConsole scannerCommandsForConsole2 = new ScannerCommandsForConsole();
                scannerCommandsForConsole2.ScannerForTwoCommand();
            }
        }
        Scan2 scan2 = new Scan2();
        scan2.Command2();
        WriteInFileToDo writeFile2 = new WriteInFileToDo();
        System.out.println(GetLocalTimeForMorningDoWater1());
        StringNames.AddTime();
        writeFile2.WriterFilesMethod();
    }
}


