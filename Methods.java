class computer{
    public void playMusic(){
        System.out.println("Play Music");
    }

    public String getPen(int cost){
        if(cost >= 10){
            return "Pen";
        }
        return "Nothing";
    }
}

public class Methods {
    public static void main (String []args){
        computer obj = new computer();

        obj.playMusic();
        String str = obj.getPen(8);

        System.out.println(str);
    }
}
