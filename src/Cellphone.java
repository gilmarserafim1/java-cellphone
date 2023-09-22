public class Cellphone implements Browser, MusicPlayer, Telephone{

    @Override
    public void call(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void answer() {
        System.out.println("Answering a call");
    }

    @Override
    public void voiceMessage() {
        System.out.println("You have voice messages");
    }

    @Override
    public void play(String song) {
        System.out.println("Playing " + song);
    }

    @Override
    public void pause() {
        System.out.println("Song paused");
    }

    @Override
    public void select(String song) {
        System.out.println("Selected " + song);
    }

    @Override
    public void showPage(String url) {
        System.out.println("Showing page " + url);
    }

    @Override
    public void newTab() {
        System.out.println("A new tab was opened");
    }

    @Override
    public void refresh() {
        System.out.println("The page was refreshed");
    }

    
}