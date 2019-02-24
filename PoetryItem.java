package ismek.com.attilalhan;

import java.io.Serializable;

public class PoetryItem implements Serializable {

    private String title;
    private String subTitle;
    private String poetry;

    public PoetryItem() {
    }

    public String getTitle() {
        return title;

    }

    public PoetryItem(String title, String subTitle, String poetry) {
        this.title = title;
        this.subTitle = subTitle;
        this.poetry = poetry;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getPoetry() {
        return poetry;
    }

    public void setPoetry(String poetry) {
        this.poetry = poetry;
    }
}
