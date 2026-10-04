package study.basics;

/**
 * 第 0 单元：验证工具链。
 *
 * <p>这个类本身没有技术含量，它的唯一目的是证明四件事同时成立：
 * <ol>
 *   <li>Maven 能编译 Java 17 源码；</li>
 *   <li>中文注释和中文输出在 UTF-8 下不乱码；</li>
 *   <li>JUnit 5 能跑起来（见同目录下的 {@code HelloJavaTest}）；</li>
 *   <li>编译产物可以脱离 Eclipse，用命令行直接运行。</li>
 * </ol>
 *
 * <p>运行方式，在 {@code java-study} 目录下执行：
 * <pre>
 *   mvn -q clean package
 *   java -cp target/classes study.basics.HelloJava
 * </pre>
 */
public final class HelloJava {

    /**
     * 私有构造器：这个类只提供静态方法，不需要被 new 出来。
     * 把构造器写成 private 并抛异常，是表达"这是工具类"的常见写法。
     */
    private HelloJava() {
        throw new AssertionError("HelloJava 是工具类，不应该被实例化");
    }

    public static void main(String[] args) {
        System.out.println("=== 工具链自检 ===");
        System.out.println("Java 版本  : " + System.getProperty("java.version"));
        System.out.println("虚拟机厂商 : " + System.getProperty("java.vendor"));
        System.out.println("默认编码   : " + System.getProperty("file.encoding"));
        System.out.println("工作目录   : " + System.getProperty("user.dir"));
        System.out.println();
        System.out.println("1 到 100 的和 = " + sum(1, 100));
        System.out.println("中文输出测试  : 你好，世界");
    }

    /**
     * 求 from 到 to 的整数和（闭区间，也就是两头都算）。
     *
     * <p>这里故意用循环而不用等差数列公式，因为现阶段要做的是"看懂每一行在干什么"，
     * 而不是比谁写得短。等进入算法专题时，自然会换成 O(1) 的公式。
     *
     * <p>边界行为：如果 from 大于 to，循环一次都不执行，返回 0。
     *
     * @param from 起始值（包含）
     * @param to   结束值（包含）
     * @return 区间内所有整数之和，用 long 接收以防 int 溢出
     */
    public static long sum(int from, int to) {
        long total = 0L;
        for (int i = from; i <= to; i++) {
            total += i;
        }
        return total;
    }
}
