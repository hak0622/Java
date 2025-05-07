package ch16.withteacher;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String>nameSupplier = ()->{return "신짱구";};
        System.out.println("name:" +nameSupplier.get());

        IntSupplier randomSupplier = ()->{
            Random random = new Random();
            return random.nextInt(100);
        };
        System.out.println("random:"+randomSupplier.getAsInt());
        System.out.println("random:"+randomSupplier.getAsInt());
        System.out.println("random:"+randomSupplier.getAsInt());
    }
}
