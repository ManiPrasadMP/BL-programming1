package objectOriented.music_player;

public class Track {
    private String title;
    private String artist;
    private int duration;
    private boolean isPlaying;

    public Track(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.isPlaying = false;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        this.isPlaying = playing;
    }

    public void display() {
        System.out.println("Track: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Status: " + (isPlaying ? "Playing" : "Paused"));
        System.out.println("------------------------------");
    }
}
