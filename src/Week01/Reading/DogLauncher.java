package Week01.Reading;

public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(5);
        // 1. instance methods
        d.makeNoise();
        // 2. class methods
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(10);
        dogs[1] = new Dog(20);
        // 用类调用类方法
        Dog maxD = Dog.maxDog(dogs[0], dogs[1]);
        // 用实例对象调用实例方法，显示个性化内容
        maxD.makeNoise();
        // 3. 类变量
        System.out.println(Dog.binomen);
    }
}
