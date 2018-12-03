import java.util.Optional;

//Optional实际上是个容器：它可以保存类型T的值，或者仅仅保存null。Optional提供很多有用的方法，这样我们就不用显式进行空值检测。
public class OptionalExample {
    public static void main(String[] args){
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("Full Name is set?"+ fullName.isPresent());
        System.out.println("Full Name:"+fullName.orElseGet(()->"[none]"));
        System.out.println(fullName.map(s -> "Hey" + s + "!").orElse("Hey Stranger!"));
        fullName = Optional.of("Roy");
        System.out.println("Full Name is set?"+ fullName.isPresent());
        System.out.println("Full Name:"+fullName.orElseGet(()->"[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
    }
}
