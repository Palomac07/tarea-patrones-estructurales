package proxy;
public class InternetReal implements Internet {
    public void conectarA(String url){
        System.out.println("conectando a " + url);
    }
}