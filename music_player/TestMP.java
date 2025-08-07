package objectOriented.music_player;

public class TestMP {
	 public static void main(String[] args) {
	        Track t1 = new Track("Let It Be", "The Beatles", 240);
	        Track t2 = new Track("Bohemian Rhapsody", "Queen", 360);

	        MusicPlayer player = new MusicPlayer(t1, t2);

	        System.out.println("Initial Track Info:");
	        player.showCurrentTrack();

	        player.play();
	        player.showCurrentTrack();

	        player.pause();
	        player.showCurrentTrack();

	        player.skip();
	        player.showCurrentTrack();

	        player.repeat();
	        player.showCurrentTrack();
	    }
	}

