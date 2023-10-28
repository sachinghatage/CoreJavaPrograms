package Q2;

public enum Title {
    MR("Mr."),MRS("Mrs."),MS("Ms");
    private final String title;
    private Title(String t){
        title=t;
    }
    public String format(String last,String first){
        return title+" "+first+" "+last;
    }

    public static void main(String[] args) {
        System.out.println(Title.MRS.format("Doe","John"));
    }
}
