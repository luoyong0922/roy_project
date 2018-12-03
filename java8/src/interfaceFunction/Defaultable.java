package interfaceFunction;

import java.util.function.Supplier;

/**
 * Java 8用默认方法与静态方法这两个新概念来扩展接口的声明。
 * 默认方法使接口有点像Traits（Scala中特征(trait)类似于Java中的Interface，
 * 但它可以包含实现代码，也就是目前Java8新增的功能），但与传统的接口又有些不一样，
 * 它允许在已有的接口中添加新方法，而同时又保持了与旧版本代码的兼容性。
 *
 * 默认方法与抽象方法不同之处在于抽象方法必须要求实现，
 * 但是默认方法则没有这个要求。相反，每个接口都必须提供一个所谓的默认实现，
 * 这样所有的接口实现者将会默认继承它（如果有必要的话，可以覆盖这个默认实现）
 *在JVM中，默认方法的实现是非常高效的，并且通过字节码指令为方法调用提供了支持。
 * 默认方法允许继续使用现有的Java接口，而同时能够保障正常的编译过程。
 *
 * !! 尽管默认方法非常强大，但是在使用默认方法时我们需要小心注意一个地方：
 * 在声明一个默认方法前，请仔细思考是不是真的有必要使用默认方法，
 * 因为默认方法会带给程序歧义，并且在复杂的继承体系中容易产生编译错误。
 */
interface Defaultable extends DefaultableFactory {
    // Interfaces now allow default methods, the implementer may or may not implement (override) them.
    default String notRequired(){
        return "Default implementation";
    }

}
