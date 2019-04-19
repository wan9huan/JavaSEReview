package leo.javase.chapter3.domain;

public class Phone {

    private String os;
    private String screan;

    public Phone() {
    }

    public Phone(String os, String screan) {
    this.os = os;
    this.screan = screan;
    }

    public String getOs() {
    return os;
    }

    public void setOs(String os) {
    this.os = os;
    }

    public String getScrean() {
    return screan;
    }

    public void setScrean(String screan) {
    this.screan = screan;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", screan='" + screan + '\'' +
                '}';
    }
}
