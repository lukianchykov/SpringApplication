package ua.lukianchykov.springapplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.Callable;

/**
 * @author Andrey Lukianchykov
 */
public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.playMusic());
//        musicPlayer.playMusic(MusicGenre.CLASSICAL);
//        musicPlayer.playMusic(MusicGenre.ROCK);
//        musicPlayer.playMusic(MusicGenre.RAP);

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);




        context.close();
    }
}
