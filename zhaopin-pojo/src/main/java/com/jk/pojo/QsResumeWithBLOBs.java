package com.jk.pojo;

public class QsResumeWithBLOBs extends QsResume {
    private String keyFull;

    private String keyPrecise;

    public String getKeyFull() {
        return keyFull;
    }

    public void setKeyFull(String keyFull) {
        this.keyFull = keyFull == null ? null : keyFull.trim();
    }

    public String getKeyPrecise() {
        return keyPrecise;
    }

    public void setKeyPrecise(String keyPrecise) {
        this.keyPrecise = keyPrecise == null ? null : keyPrecise.trim();
    }
}