package com.example.cameraproject;

import android.graphics.Bitmap;
import android.graphics.Color;

public class ImageProcessor {

    /**
     * 흑백(Grayscale) 변환
     */
    public static Bitmap toGrayscale(Bitmap src) {
        int width = src.getWidth();
        int height = src.getHeight();

        Bitmap result = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int pixel = src.getPixel(x, y);

                int r = Color.red(pixel);
                int g = Color.green(pixel);
                int b = Color.blue(pixel);

                int gray = (r + g + b) / 3;
                result.setPixel(x, y, Color.rgb(gray, gray, gray));
            }
        }
        return result;
    }

    /**
     * 간단한 노이즈 제거 (평균 필터)
     */
    public static Bitmap removeNoise(Bitmap src) {
        int width = src.getWidth();
        int height = src.getHeight();

        Bitmap result = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        for (int x = 1; x < width - 1; x++) {
            for (int y = 1; y < height - 1; y++) {
                int sum = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int pixel = src.getPixel(x + i, y + j);
                        sum += Color.red(pixel);
                    }
                }

                int avg = sum / 9;
                result.setPixel(x, y, Color.rgb(avg, avg, avg));
            }
        }
        return result;
    }
}
