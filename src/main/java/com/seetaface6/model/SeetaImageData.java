package com.seetaface6.model;

/**
 * @author kaisir
 */
public class SeetaImageData {

    public byte[] data;
    public int width;
    public int height;
    public int channels;

    public SeetaImageData() {

    }

    public SeetaImageData(int width, int height, int channels) {
        this.data = new byte[width * height * channels];
        this.width = width;
        this.height = height;
        this.channels = channels;
    }

    public SeetaImageData(int width, int height) {
        this(width, height, 3);
    }
}