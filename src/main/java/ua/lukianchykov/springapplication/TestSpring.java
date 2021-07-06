package ua.lukianchykov.springapplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Andrey Lukianchykov
 */
public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());


//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comprasion = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comprasion);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());


        context.close();
    }
}
