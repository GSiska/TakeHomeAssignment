package Enum;

public enum Credential {
    USERNAME("standard_user"),
    PASSWORD("secret_sauce"),
    MOSTEXPENSIVEPRODUCTNAME("Sauce Labs Fleece Jacket"),
    MOSTEXPENSIVEPRODUCTPRICE("$49.99"),
    FIRSTNAME("Gabriella"),
    LASTNAME("Siska"),
    POSTALCODE("11440");

    private String credential;
    private Credential(String credential) { this.credential = credential; }
    public String getCredential() {
        return credential;
    }
}
