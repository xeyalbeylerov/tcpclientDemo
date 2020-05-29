package util;

import static util.InputUtil.inputString;

public class AskingFromUser {
    public static String[] askNameAndSurname() {
        String name = inputString("Your name:");
        String surname = inputString("Your surname:");
        return new String[]{name,surname};
    }


    public static String askFilePath() {
        String filepath = inputString("Please type file path of sending file:");
        return filepath;
    }


    public static String askServerIpAndPort() {
        String serverIpAndPort = inputString("Please type tcp server and port like localhost:6789");
        return serverIpAndPort;
    }
}
