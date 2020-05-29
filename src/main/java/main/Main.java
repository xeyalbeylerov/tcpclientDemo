package main;

public class Main {
    public static void main(String[] args) {


       MainProcess.appStarter();
    }
}
//    Praktiki Tapşırıq:
//
//        Proyekt maven-da olacaq və sonda öz git repositorynizə push edəcəksiniz və mənə github repository linkini göndərəcəksiniz proyekti zip edib göndərməyəcəksiniz.
//
//        Proyekt açılanda müştəridən ad soyadını istəyəcəksiniz. Müştəri ad soyadını daxil edəcək.
//
//        Müştəridən soruşusunuz:
//        Zəhmət olmasa göndərmək istədiyiniz faylın yerləşdiyi keçidi qeyd edin. Tutaq ki, daxil edirik:
//        C:/Users/Sarkhan Rasullu/Desktop/qeydlerim.txt
//        C:/Users/xeyal/Desktop/AAA.txt
//
//        Daha sonra müştəridən yenidən soruşursunuz bu şəkli göndərmək istədiyiniz şəxsin(serverin) ip və portunu daxil edin:
//        Biz bu qaydada daxil edəcəyik:
//        localhost:5678
//        localhost:6789
//
//        Iki nöqtə olsun mütləq. Siz bu mesajı split edəcəksiniz və sizə lazım olan ip və portu əldə edəcksiniz:
//        String[] arr = str.split(“:”);
//        String ip = arr[0];
//        int port = Integer.parseInt(arr[1]);
//
//        Və bu ip port-a daxil olub həmin faylı göndərəcəksiniz göndərdikdən sonra da mesaj çapa verəcəksiniz ki, uğurla göndərildi.
