package proxy;
public class Main {

    public static void main(String[] args) {

        Internet internet = new InternetProxy();

        internet.conectarA("google.com");
        internet.conectarA("facebook.com");
        internet.conectarA("linkedin.com");
    }
}