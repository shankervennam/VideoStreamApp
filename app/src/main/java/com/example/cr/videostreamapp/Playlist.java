package com.example.cr.videostreamapp;

import java.security.PublicKey;

/**
 * Created by CR& on 8/16/2017.
 */

public class Playlist
{
    public final static int TYPE_MASTER=0;
    public final static int TYPE_MEDIA=1;

    public  String baseUri;
    public  int type;

    public Playlist(String baseUri, int type)
    {
        this.baseUri = baseUri;
        this.type = type;
    }
}
