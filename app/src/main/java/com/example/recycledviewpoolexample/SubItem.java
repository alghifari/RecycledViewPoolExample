package com.example.recycledviewpoolexample;

public class SubItem {
    private int subItemImage;
    private String subItemTitle;
    private String subItemDesc;

    public SubItem(String subItemTitle, String subItemDesc) {
        this.subItemTitle = subItemTitle;
        this.subItemDesc = subItemDesc;
    }

    public int getSubItemImage() {
        return subItemImage;
    }

    public void setSubItemImage(int subItemImage) {
        this.subItemImage = subItemImage;
    }

    public String getSubItemTitle() {
        return subItemTitle;
    }

    public void setSubItemTitle(String subItemTitle) {
        this.subItemTitle = subItemTitle;
    }

    public String getSubItemDesc() {
        return subItemDesc;
    }

    public void setSubItemDesc(String subItemDesc) {
        this.subItemDesc = subItemDesc;
    }
}
