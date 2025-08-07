package objectOriented.music_player;

public class MusicPlayer implements Media {
    private Track currentTrack;
    private Track nextTrack;

    public MusicPlayer(Track currentTrack, Track nextTrack) {
        this.currentTrack = currentTrack;
        this.nextTrack = nextTrack;
    }

    @Override
    public void play() {
        currentTrack.setPlaying(true);
        System.out.println("Now playing: " + currentTrack.getTitle());
    }

    @Override
    public void pause() {
        currentTrack.setPlaying(false);
        System.out.println("Paused: " + currentTrack.getTitle());
    }

    @Override
    public void skip() {
        System.out.println("Skipping to next track: " + nextTrack.getTitle());
        currentTrack.setPlaying(false);
        nextTrack.setPlaying(true);

        Track temp = currentTrack;
        currentTrack = nextTrack;
        nextTrack = temp;
    }

    @Override
    public void repeat() {
        System.out.println("Repeating current track: " + currentTrack.getTitle());
        currentTrack.setPlaying(true);
    }

    public void showCurrentTrack() {
        currentTrack.display();
    }

    public void showNextTrack() {
        nextTrack.display();
    }
}
