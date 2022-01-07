package com.avinash.DbDemo.Model;

import javax.persistence.*;


public class Specs {
    private String ramAndType;
    private String romAndType;
    private String processor;
    private String displayAndType;

    public String getRamAndType() {
        return ramAndType;
    }

    public void setRamAndType(String ramAndType) {
        this.ramAndType = ramAndType;
    }

    public String getRomAndType() {
        return romAndType;
    }

    public void setRomAndType(String romAndType) {
        this.romAndType = romAndType;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getDisplayAndType() {
        return displayAndType;
    }

    public void setDisplayAndType(String displayAndType) {
        this.displayAndType = displayAndType;
    }
}
