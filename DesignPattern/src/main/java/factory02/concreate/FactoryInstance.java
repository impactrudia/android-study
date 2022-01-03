package factory02.concreate;

import factory02.abst.GuiFactory;
import factory02.linux.LinuxGuiFactory;
import factory02.mac.MacGuiFactory;
import factory02.window.WindowGuiFactory;

public class FactoryInstance {

    private static int getOsCode() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            return 0;
        }
        return 1;
    }

    public static GuiFactory getGuiFactory() {
        switch (getOsCode()) {
            case 0:
                return new MacGuiFactory();
            case 1:
                return new LinuxGuiFactory();
            case 2:
                return new WindowGuiFactory();
        }
        return null;
    }
}
