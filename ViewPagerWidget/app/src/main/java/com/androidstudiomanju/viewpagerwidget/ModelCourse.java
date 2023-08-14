package com.androidstudiomanju.viewpagerwidget;
// created to display data of typelayout
public enum ModelCourse {
    RED(R.string.red,R.layout.view_red),
    BLUE(R.string.blue,R.layout.view_blue),
    GREEN(R.string.green,R.layout.view_green);
    private int mTitle;
    private int mLayoutId;

    ModelCourse(int mTitle, int mLayoutId) {
        this.mTitle = mTitle;
        this.mLayoutId = mLayoutId;
    }

    public int getmTitle() {
        return mTitle;
    }

    public int getmLayoutId() {
        return mLayoutId;
    }
}
