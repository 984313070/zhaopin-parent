package com.jk.pojo;

public class QsJobsWithBLOBs extends QsJobs {
    private String contents;

    private String keyPrecise;

    private String keyFull;

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    public String getKeyPrecise() {
        return keyPrecise;
    }

    public void setKeyPrecise(String keyPrecise) {
        this.keyPrecise = keyPrecise == null ? null : keyPrecise.trim();
    }

    public String getKeyFull() {
        return keyFull;
    }

    public void setKeyFull(String keyFull) {
        this.keyFull = keyFull == null ? null : keyFull.trim();
    }
}