package structuralPatterns.facade.example1;

import structuralPatterns.facade.example1.facade.VideoConversionFacade;

import java.io.File;

public class DemoClient {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}

