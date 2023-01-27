import java.util.Scanner;

public class ScannerCommandsForConsole {

    public void ScannerForGetFirstCommand () {

        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();
        while (num!= 1 && num!=2 && num!=3 && num!=4){
            System.out.println("Такой команды не существует.Повторите выбор");
            Integer numRepeat = scanner.nextInt();
            if (numRepeat == 1) {
                StringNames.EnterTime();
                Collection collection = new Collection();
                collection.Get1();
                break;
            }
        }
        if (num == 1) {
            StringNames.EnterTime();
            Collection collection = new Collection();
            collection.Get1();
        }
    }
    public void ScannerForTwoCommand () {

        Scanner scanner1 = new Scanner(System.in);
        var str = scanner1.nextLine();
        boolean strEmpty = str.isEmpty();
        while (strEmpty!= false){
            System.out.println("Пустая команда,повторите ввод");
            String str2 = scanner1.nextLine();
            if (!str2.isEmpty() ){
                break;
            }
        }
    }
}
