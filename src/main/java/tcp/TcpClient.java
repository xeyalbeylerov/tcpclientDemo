package tcp;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static boolean sendFileToServer(byte[] bytes, String serverAddress, int port) {
        try (Socket socket = new Socket(serverAddress, port)) {
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(bytes);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
