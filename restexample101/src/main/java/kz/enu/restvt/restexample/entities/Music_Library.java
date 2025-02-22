package kz.enu.restvt.restexample.entities;

public class Music_Library {
    public Music_Library() {

    }

    @Override
    public String toString() {
        return "Music_Library{" +
                "data=" + data +
                ", age1=" + age1 +
                ", firstname='" + firstname + '\'' +
                ", playlist='" + playlist + '\'' +
                '}';
    }

    private int data;

    private int age1;

    private String firstname;

    private String playlist;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public Music_Library(int data, int age1, String firstname, String playlist) {
        this.data = data;
        this.age1 = age1;
        this.firstname = firstname;
        this.playlist = playlist;
    }
}
