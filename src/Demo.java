import java.awt.*;
import java.util.Arrays;

/**
 * Created by matthew on 17-6-8.
 */
public class Demo {
    public static void main(String args[]) {
        System.out.println("Hello, learn java 8.0");

    /*
    * 2.Java语言的新特性
    *    不管怎么说，Java 8都是一个变化巨大的版本。你可能认为Java 8耗费了大量的时间才得以完成是为了实现了每个Java程序员所期待的特性。
    *    在这个小节里，我们将会涉及到这些特性的大部分。
    *
    * 2.1 Lambda表达式与Functional接口
    *    Lambda表达式（也称为闭包）是整个Java 8发行版中最受期待的在Java语言层面上的改变，Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中），
    *    或者把代码看成数据：函数式程序员对这一概念非常熟悉。在JVM平台上的很多语言（Groovy，Scala，……）从一开始就有Lambda，
    *    但是Java程序员不得不使用毫无新意的匿名类来代替lambda。
    *    关于Lambda设计的讨论占用了大量的时间与社区的努力。可喜的是，最终找到了一个平衡点，使得可以使用一种即简洁又紧凑的新方式来构造Lambdas。
    *    在最简单的形式中，一个lambda可以由用逗号分隔的参数列表、–>符号与函数体三部分表示。
    * */

        Arrays.asList("hello", "java").forEach( e -> System.out.println(e));
        /*参数类型与参数包括在括号中的形式直接给出参数的类型*/
        Arrays.asList("hello", "android").forEach((String e) -> System.out.println(e));

        /*lambda的函数体会更加复杂，这时可以把函数体放到在一对花括号中，就像在Java中定义普通函数一样。*/
        Arrays.asList("hello", "openthos").forEach( e -> {
            System.out.println("++++++");
            System.out.println("------");
            System.out.println(e);
        });
    }
}
