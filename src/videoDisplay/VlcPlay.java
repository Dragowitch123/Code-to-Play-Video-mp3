package videoDisplay;

import java.io.IOException;

public class VlcPlay {

	public static void main(String[] args) {
		try {
			ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe",
					"E:\\VIdeo Songs\\Demon Slayer.mp4");
			pb.start();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Video Started");
	}

}
