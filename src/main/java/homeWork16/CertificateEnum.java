package homeWork16;

import homeWork11.BaseClass;

public enum CertificateEnum {
    NOCERIFICATE("nocert"), INVALIDCERTIFICATE("invalid"), VALIDCERTIFICATE ("valid");

    CertificateEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    private String type;

}
