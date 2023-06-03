package Enum;

public enum Credential{
    USERNAME("standard_user"),
    PASSWORD("secret_sauce");

    private String credential;
    private Credential(String credential) { this.credential = credential; }
    public String getCredential() {
        return credential;
    }
}
