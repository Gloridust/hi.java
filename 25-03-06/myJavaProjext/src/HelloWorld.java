public class HelloWorld {
    // 主方法，程序的入口
    // public: 访问修饰符，表示该方法可以被其他类访问
    // static: 表示该方法是静态的，可以不需要创建类的实例而直接调用
    // void: 返回类型，表示该方法不返回任何值
    // main: 方法名，Java程序的入口点，程序从这里开始执行
    // String[] args: 参数，表示接收命令行参数的字符串数组
    public static void main(String[] args) {
        // 打印 "Hello, World!" 到控制台
        System.out.println("Hello, World!");

        // 变量示例
        int number = 10; // 整数类型
        String message = "这是一个 Java 示例"; // 字符串类型

        // 条件语句示例
        if (number > 5) {
            System.out.println("数字大于 5");
        } else {
            System.out.println("数字小于或等于 5");
        }

        // 循环示例
        for (int i = 0; i < 5; i++) {
            System.out.println("循环次数: " + i);
        }
    }
}
