public class App {
    public static void main(String[] args) throws Exception {
        Cellphone cellphone = new Cellphone();
        cellphone.showPage("www.dio.me"); 
        cellphone.newTab();
        cellphone.refresh();
        cellphone.play("Nothing Else Matters");
        cellphone.pause();
        cellphone.select("Master of Puppets");
        cellphone.call("+5531993036572");
        cellphone.answer();
        cellphone.voiceMessage();       
    }
}
