package com.example.cr.videostreamapp;

import android.os.Bundle;

import java.util.ArrayList;

public class MediaItem
{
    private String title, subTitle, studio, url, contentType, duration;
    private ArrayList<String> imageList  = new ArrayList<>();

    public static final String KEY_TITLE ="title";
    public static final String KEY_SUBTITLE ="subtitle";
    public static final String KEY_STUDIO ="studio";
    public static final String KEY_URL ="movieurl";
    public static final String KEY_IMAGES= "images";
    public static final String KEY_CONTENT_TYPE ="contenttype";

    public String getTitle() {
        return title;
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

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        studio = studio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ArrayList<String> getImageList() {
        return imageList;
    }

    public void setImageList(ArrayList<String> imageList) {
        this.imageList = imageList;
    }

    public Bundle bundleClass()
    {
        Bundle wrapper = new Bundle();
        wrapper.putString(KEY_TITLE, title);
        wrapper.putString(KEY_CONTENT_TYPE, "video/mp4");
        wrapper.putString(KEY_STUDIO, studio);
        wrapper.putString(KEY_URL, url);
        wrapper.putStringArrayList(KEY_IMAGES, imageList);
        return wrapper;
    }

    public static final MediaItem fromBundle(Bundle wrapper)
    {
        if(null == wrapper)
        {
            return null;
        }

        MediaItem item = new MediaItem();
        item.setUrl(wrapper.getString(KEY_URL));
        item.setContentType(wrapper.getString(KEY_CONTENT_TYPE));
        item.setTitle(wrapper.getString(KEY_TITLE));
        item.setSubTitle(wrapper.getString(KEY_SUBTITLE));
        item.setStudio(wrapper.getString(KEY_STUDIO));
        item.imageList.addAll(wrapper.getStringArrayList(KEY_IMAGES));
        item.setContentType(wrapper.getString(KEY_CONTENT_TYPE));
        return item;
    }
}
