package ua.lukianchykov.springapplication;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey Lukianchykov
 */
@Component
public class RapMusic implements Music {

    private List<String> rapMusicList = new ArrayList<>();

    public RapMusic(List<String> rapMusicList) {
        rapMusicList.add("JT Machinima: Newer Wake Again");
        rapMusicList.add("JT Machinima: Mercy vs Medic");
        rapMusicList.add("JT Machinima: Your Head Will be Mine");
        this.rapMusicList = rapMusicList;
    }
    @Override
    public List<String> getSongs() {
        return rapMusicList;
    }
}
