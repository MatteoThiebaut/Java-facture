package a;

public class Client {
    private String nom;
    private String mail;
    private TypeClient typeclient;

    private void client(String nom, String mail, TypeClient typeclient) {
        this.nom = nom;
        this.mail = mail;
        this.typeclient = typeclient;
    }
}