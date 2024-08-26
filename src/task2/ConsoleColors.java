package task2;

public enum ConsoleColors {
    RED ("\033[91m"),
    PINK ("\033[95m"),
    YELLOW ("\033[93m"),
    GREEN ("\033[92m"),
    SEA ("\033[96m"),
    BLUE ("\033[94m"),
    WHITE ("\033[97m"),
    GRAY ("\033[90m"),
    BLACK ("\033[30m");

    private String color;

    ConsoleColors(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }

    public void out(Object obj){
        System.out.println(color + obj);
    }
}
