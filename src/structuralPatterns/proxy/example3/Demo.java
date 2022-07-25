package structuralPatterns.proxy.example3;

import structuralPatterns.proxy.example3.downloader.Client_YouTubeDownloader;
import structuralPatterns.proxy.example3.proxy.YouTubeCacheProxy;
import structuralPatterns.proxy.example3.service_media_library.ThirdPartyYouTubeClass;

public class Demo {
    public static void main(String[] args) {
        Client_YouTubeDownloader naiveDownloader = new Client_YouTubeDownloader(new ThirdPartyYouTubeClass());
        Client_YouTubeDownloader smartDownloader = new Client_YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(Client_YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
