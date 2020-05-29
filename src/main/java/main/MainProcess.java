package main;

import file.FileReader;
import tcp.TcpClient;

import java.util.regex.Pattern;

import static util.AskingFromUser.*;

public class MainProcess {
    public static void appStarter() {
        askNameAndSurname();//NameAndSurname not used yet

        byte[] file = FileReader.readFromFileAsBytesAndCheck(askFilePath());//Asking filepath from user and get file
        if (file == null) {//if file is null then ask again
            file = FileReader.readFromFileAsBytesAndCheck(askFilePath());
        }

        String[] splittedServer = serverIpAndPortSplitter(askServerIpAndPort());//get splitted server and port
        if (splittedServer == null) {//if parameter is not valid then ask again
            System.out.println("Illegal argument");
            splittedServer = serverIpAndPortSplitter(askServerIpAndPort());
        }

        String address = splittedServer[0];

        String portStr = splittedServer[1];
        int port = Integer.parseInt(portStr);//parsing string port to int

        boolean checkTcp = TcpClient.sendFileToServer(file, address, port);//send file.If file sending then return true
        if (checkTcp) {
            System.out.println("File successfully sending");
        } else {
            System.err.println("Occurs an exception while file sending to server");
        }

    }


    private static String[] serverIpAndPortSplitter(String string) {
        if (string != null && (!string.isEmpty()) && string.contains(":")) {
            String[] spilttedString = string.split(":");
            if(spilttedString.length != 2){return null;}//check splittedString has two parameter
            if(!isNumber(spilttedString[1])){return null;}//check port only number
            if((spilttedString[0]).isEmpty()){return null;}//check address is not empty
            if((spilttedString[1]).isEmpty()){return null;}//check port is not empty
            return spilttedString;
        } else {
            return null;
        }
    }

    private static boolean isNumber(String input) {
        String regex = "\\d+";//regex digit
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();//if input contains only number then return
    }


}
