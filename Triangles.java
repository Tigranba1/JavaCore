package JavaCore;

public class Triangles {
    private int width;
    private int height;

    public Triangles(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Triangles(int height) {
        this.height = height;
    }

    public Triangles() {

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Create triangle with direction
     * @param height
     * @param direction
     */
    public static void draw(int height, String direction) {
        switch (direction) {
            case "up":
                for (int i = 1; i <= height; ++i) {
                    for (int j = 1; j <= i; ++j) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case "down":
                for (int i = height; i >= 1; i--) {
                    for (int j = 1; j <= i; ++j) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case "up-right":
                for (int i = 0; i <= height; i++) {
                    for (int j = 1; j <= height - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");

                }
                break;
            case "down-right":
                for (int i = height; i >= 1; i--) {
                    for (int j = height; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");

                }
                break;
            case "pyramid":
                for (int i = 0; i <= height - 1; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= height - 1 - i; k++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                break;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Triangles triangle = new Triangles();
        draw(5, "up-right");
        draw(5, "up");
        draw(5, "down-right");
        draw(5, "down");
        draw(5, "pyramid");

    }
}


