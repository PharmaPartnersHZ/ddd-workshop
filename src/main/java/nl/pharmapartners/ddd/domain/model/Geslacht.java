package nl.pharmapartners.ddd.domain.model;

import java.util.Arrays;

//TODO 2: add the proper annotation from the annotations package here
public enum Geslacht {

    MAN("M"), VROUW("V"), ANDERS("X");

    private String code;
    Geslacht(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Geslacht getGeslacht(String code) {
        return Arrays.stream(Geslacht.values())
                .filter(geslacht -> geslacht.code.equals(code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("geslacht with code" + code + "does not exist"));
    }

}
