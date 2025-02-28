package day09.lambda.ex02;


//Person 클래스는 Workable을 매개변수로 갖는 action메소드와 speakable을 매개변수로 갖는 action2.
public class Person {
private String name;
private String job;
private String contents;
private String songname;

    public Person(String name, String job, String contents, String songname) {
        this.name = name;
        this.job = job;
        this.contents = contents;
        this.songname = songname;
    }

    public void action(Workable workable) {
        workable.work(name,job);

    }
    public void action2(Speakable speakable) {
        speakable.speak(contents);

    }
    public void action3(Sing sing) {
        sing.song(songname);

    }
}

