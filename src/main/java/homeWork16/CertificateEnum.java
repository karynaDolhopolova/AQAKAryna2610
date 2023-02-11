package homeWork16;

import homeWork11.BaseClass;

public enum CertificateEnum {
    CERTIFICATE_ONE("invalid1", true),
    CERTIFICATE_TWO("invalid2", true),
    CERTIFICATE_THREE ("invalid3", true),
    CERTIFICATE_FOUR ("valid", false);

    CertificateEnum(String type, boolean errorMes) {
        this.type = type;
        this.errorMes = errorMes;
    }

    public String getType() {
        return type;
    }

    private String type;

    public boolean isErrorMes() {
        return errorMes;
    }

    private boolean errorMes;

}
