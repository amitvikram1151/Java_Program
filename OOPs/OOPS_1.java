//basic of oops
public class OOPS_1{
    public static void main(String[] args) {
      pen p1 = new pen();
      p1.setColor("blue");
      p1.setName("pentonic");  
      p1.setTip(2);
      
      System.out.println("printng the details");
      System.out.println(p1.getName());
      System.out.println(p1.getColor());
      System.out.println(p1.getTip());
    }
}

class pen {
    private String name;
    private String color;
    private int tips;
    //setter
    void setName(String name){
        this.name = name;
    }
    void setColor(String color) {
        this.color = color;
    }
    void setTip(int tip) {
        this.tips = tip;
    }

    //geter
    int getTip() {
        return tips;
    }

    String getColor() {
        return color;
    }
    String getName() {
        return name;
    }
}