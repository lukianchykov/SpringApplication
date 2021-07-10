package ua.lukianchykov.springapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Andrey Lukianchykov
 */
@Component
public class MusicPlayer {
    //private List<Music> musicList = new ArrayList<>();
//    private ClassicalMusic classicalMusicList;
//    private RockMusic rockMusicList;
//    private RapMusic rapMusicList;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music;
    private Music music1;
    private Music music2;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music,
                       @Qualifier("rockMusic") Music music1,
                       @Qualifier("rapMusic") Music music2) {
        this.music = music;
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Playing: "
                + music.getSong() + ", "
                + music1.getSong() + ", "
                + music2.getSong();
    }

    //IoC
//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusicList, RockMusic rockMusicList, RapMusic rapMusicList) {
//        this.classicalMusicList = classicalMusicList;
//        this.rockMusicList = rockMusicList;
//        this.rapMusicList = rapMusicList;
//    }


//    @Autowired
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public void playMusic(MusicGenre mGenre) {
//        Random random = new Random();
//        int randNumber = random.nextInt(3);
//        if (mGenre == MusicGenre.CLASSICAL) {
//            System.out.println("Playing: " + classicalMusicList.getSongs().get(randNumber));
//        } else if (mGenre == MusicGenre.ROCK) {
//            System.out.println("Playing: " + rockMusicList.getSongs().get(randNumber));
//        } else {
//            System.out.println("Playing: " + rapMusicList.getSongs().get(randNumber));
//        }
//    }

}
