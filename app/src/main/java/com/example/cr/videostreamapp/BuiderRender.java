package com.example.cr.videostreamapp;

import android.content.Context;

import com.google.android.exoplayer.hls.HlsPlaylist;
import com.google.android.exoplayer.util.ManifestFetcher;

import java.io.IOException;

/**
 * Created by CR& on 8/16/2017.
 */

public class BuiderRender implements ILRender_Binder
{
    private static final int BUFFER_SEGMENT_SIZE = 64 * 1024;
    private static final int MAIN_BUFFER_SEGMENT = 254;
    private static final int AUDIO_BUFFER_SEGMENT = 54;
    private static final int TEXT_BUFFER_sEGMENT = 2;
    private Context  context;
    private String userAgent;
    private String url;
    private AsyncRenderBuilder asyncRenderBuilder;

    public BuiderRender()
    {
//        TODO
    }

    @Override
    public void buildRenders()
    {
//        TODO
    }

    @Override
    public void cancel()
    {
        //TODO
    }

    public void onSingleManifestError(IOException e)
    {
        //TODO
    }

    public void onSingleManifest(Playlist playlist)
    {

    }

    private static final class AsyncRenderBuilder implements ManifestFetcher.ManifestCallback<HlsPlaylist>
    {
        private  final  Context context= null;



        @Override
        public void onSingleManifest(HlsPlaylist manifest) {

        }

        @Override
        public void onSingleManifestError(IOException e) {

        }
    }
}
