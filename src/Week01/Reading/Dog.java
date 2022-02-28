package Week01.Reading;

public class Dog {
    public int weight;
    public static String binomen = "Canis familiar";
    /** One integer constructor for dogs */
    public Dog(int w){
        weight = w;
    }
    // instance methods
    public void makeNoise(){
        if(weight<10){
            System.out.println("bark111");
        }else if(weight<30){
            System.out.println("bark222");
        }else{
            System.out.println("bark333");
        }
    }
    // class methods
    public static Dog maxDog(Dog d1, Dog d2){
        if(d1.weight >= d2.weight){
            return d1;
        }
        else{
            return d2;
        }
    }

}
