import java.util.Arrays;

public class Lambda {

    /**
     * Lambda表达式（也称为闭包）是整个Java 8发行版中最受期待的在Java语言层面上的改变，
     * Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中），
     * 或者把代码看成数据：函数式程序员对这一概念非常熟悉。
     * 在JVM平台上的很多语言（Groovy，Scala，……）从一开始就有Lambda，
     * 但是Java程序员不得不使用毫无新意的匿名类来代替lambda。
     *
     * 关于Lambda设计的讨论占用了大量的时间与社区的努力。
     * 可喜的是，最终找到了一个平衡点，
     * 使得可以使用一种即简洁又紧凑的新方式来构造Lambdas。
     * 在最简单的形式中，一个lambda可以由用逗号分隔的参数列表、–>符号与函数体三部分表示
     * @param parm
     */
    public static void main(String[] parm){
//    参数e的类型是由编译器推测出来的。同时，你也可以通过把参数类型与参数包括在括号中的形式直接给出参数的类型
        Arrays.asList("r","o","y",1).forEach(e -> System.out.println(e));
        Arrays.asList("r","o","y").forEach((String e) -> System.out.println(e));
//        在某些情况下lambda的函数体会更加复杂，这时可以把函数体放到在一对花括号中，就像在Java中定义普通函数一样
        Arrays.asList("r","o","y").forEach((String e) -> {
            System.out.println(e);
            System.out.println("*************");
        });
//        Lambda可以引用类的成员变量与局部变量（如果这些变量不是final的话，它们会被隐含的转为final，这样效率更高）
        String separator = ",";  // 等同于 final String separator = ",";
        Arrays.asList("r","o","y").forEach(
                (String e) -> {
            System.out.print(e+separator);
            System.out.println("------------");
        });
//        Lambda可能会返回一个值。返回值的类型也是由编译器推测出来的。如果lambda的函数体只有一行的话，那么没有必要显式使用return语句
        Arrays.asList("r","o","y","r" ).sort( ( e1 , e2 ) ->  e1.compareTo(e2) );
        //上下两种写法等价
        Arrays.asList( "r","o","y","r" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );
    }
}
