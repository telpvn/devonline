package academy.devonline.java.basic.section02.structure;

import java.io.File;

public class MkDir {
    public static void main(String[] args) {
        new File(args[0]).mkdir();
    }
}
