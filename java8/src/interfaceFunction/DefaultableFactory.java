package interfaceFunction;

import java.util.function.Supplier;

public interface DefaultableFactory {
    //    接口可以声明（并且可以提供实现）静态方法
// Interfaces now allow static methods
    static Defaultable create( Supplier< Defaultable > supplier ) {
        return supplier.get();
    }
}
