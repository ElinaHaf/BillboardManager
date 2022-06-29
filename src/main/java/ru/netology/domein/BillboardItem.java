package ru.netology.domein;

public class BillboardItem {
    private int id;
    private String filmName;
    private String filmStyle;
    private String dataRelease;

    public BillboardItem(int id, String filmName, String filmStyle, String dataRelease){
        this.id = id;
        this.filmName = filmName;
        this.filmStyle = filmStyle;
        this.dataRelease = dataRelease;
    }

    public int getId() {
        return id;
    }
    public String getFilmName(){
        return filmName;
    }
    public String getFilmStyle(){
        return filmStyle;
    }
    public String getDataRelease(){
        return dataRelease;
    }
}
