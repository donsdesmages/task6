public class StringNames extends Collection {

    static String morningWaterProcess = "Принять душ";
    static String goingToTheRun = "Пойти на пробежку";
    static String breakfast = "Позавтракать";
    static String takeLearning = "Заняться учебой";
    static String command1 = "[COMMAND]-1";
    static String command2 = "[COMMAND]-2";
    static String command3 = "[COMMAND]-3";
    static String command4 = "[COMMAND]-4";
    static String messageForTxtFileWithGoodDay = "Доброго времени суток" + "\n==[Ваш список дел]==";

    public static void printMenu() {
        System.out.println("Выберите дело из списка задач");
    }
    public static void printForiMenu() {
        for (int i = 0; i < 29 ; i++) {
            System.out.print("_");
        }
    }
    public static void namesToDo() {
        System.out.println(command1 + " "
            + morningWaterProcess +
            "\n_____________________________\n"
            + command2  + " " + goingToTheRun + " "
            + "\n_____________________________\n"
            + command3 + " " + breakfast + " "
            + "\n_____________________________\n"
            + command4 + " " + takeLearning
            + "\n_____________________________\n"
        );
    }
    public static void EnterTime () {
        System.out.println("Назначьте время для принятия душа" +
            "\n_________________________________\n" );
    }
    public static void AddTime (){
        String timeAdd = "Время выбрано." + "\nДело добавлено в файл.";
        System.out.println(timeAdd);
    }
}
