package jiwoo.submit11.q01;

public class AudioBoard extends Board {
    private String audio;

    public AudioBoard(String audio) {
        this.audio = audio;
    }

    public AudioBoard(int num, String title, String date, String detail, String audio) {
        super(num, title, date, detail);
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "AudioBoard{" +
                "num=" + getNum() +
                ", title='" + getTitle() + '\'' +
                ", date='" + getDate() + '\'' +
                ", detail='" + getDetail() + '\'' +
                ", audio='" + audio + '\'' +
                '}';
    }


    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
