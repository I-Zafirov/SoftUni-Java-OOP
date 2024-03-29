package T13Solid.lab;

public class PasswordHasher {

    private Encryp encryp;

    public PasswordHasher(Encryp encryp) {
        this.encryp = encryp;
    }

    public String hash(String password) {
        return encryp.encode(password);
    }
}
