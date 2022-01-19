package composite;

public class Main {

    public static void main(String[] args) {
//        root home rudia music picture doc user
//        track1 track2 pic1 doc1 java

        Folder root = new Folder("root");
        Folder home = new Folder("home");
        Folder rudia = new Folder("rudia");
        Folder music = new Folder("music");
        Folder picture = new Folder("picture");
        Folder doc = new Folder("doc");
        Folder user = new Folder("user");

        File track1 = new File("track1");
        File track2 = new File("track2");
        File pic1 = new File("pic1");
        File doc1 = new File("doc1");
        File java = new File("java");

        root.addComponent(home);
        home.addComponent(rudia);
        rudia.addComponent(music);
        music.addComponent(track1);
        music.addComponent(track2);
        rudia.addComponent(picture);
        picture.addComponent(pic1);
        rudia.addComponent(doc);
        doc.addComponent(doc1);

        root.addComponent(user);
        user.addComponent(java);

        show(root);
    }

    private static void show(Component component) {
        System.out.println(component.getName() + "|" + component.getClass().getName());
        if (component instanceof Folder) {
            for (Component c : ((Folder) component).getChildren()) {
                show(c);
            }
        }
    }
}
