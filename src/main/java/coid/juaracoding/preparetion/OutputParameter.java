package coid.juaracoding.preparetion;

public class OutputParameter {
    public static void main(String[] args) {
        //String strAlamatServer = "https://dev.juaracoding.com";
        String strAlamatServer = args[0];
        //String strBrowser = "SAFARI";
        String strBrowser = args[1];
        //String strPathFileImage = "/usr/local/bin";
        String strPathFileImage = args[2];
        System.out.println("Value browser : "+strBrowser);
        System.out.println("Value Alamat Server : "+strAlamatServer);
        System.out.println("Value Path Image : "+strPathFileImage);
    }
}
