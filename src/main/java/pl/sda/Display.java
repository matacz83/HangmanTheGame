package pl.sda;

public class Display {
    public static void drawHangman(int errors) {
        switch (errors) {
            case 1:
                draw1error();
                break;
            case 2:
                draw2errors();
                break;
            case 3:
                draw3errors();
                break;
            case 4:
                draw4errors();
                break;
            case 5:
                draw5errors();
                break;
            case 6:
                draw6errors();
        }
    }

    private static void draw1error(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("        ______|______");
    }
    private static void draw2errors(){
        System.out.println("              ");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("        ______|______");
    }
    private static void draw3errors(){
        System.out.println("              ____________");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("        ______|______");
    }
    private static void draw4errors(){
        System.out.println("              ____________");
        System.out.println("              |          |");
        System.out.println("              |         (-_-)");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("        ______|______");
    }
    private static void draw5errors(){
        System.out.println("              ____________");
        System.out.println("              |          |");
        System.out.println("              |         (-_-)");
        System.out.println("              |          ||");
        System.out.println("              |      O===||===O");
        System.out.println("              |          ||");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("        ______|______");
    }
    private static void draw6errors(){
        System.out.println("              ____________");
        System.out.println("              |          |");
        System.out.println("              |         (-_-)");
        System.out.println("              |          ||");
        System.out.println("              |      O===||===O");
        System.out.println("              |          ||");
        System.out.println("              |          /\\");
        System.out.println("              |         /  \\");
        System.out.println("              |       _/    \\_");
        System.out.println("              |");
        System.out.println("        ______|______");
    }
}
