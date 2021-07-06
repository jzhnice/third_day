/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-06 08:36
 * 如何从键盘获取不同类型的变量：需要使用Scanner类
 * <p>
 * 具体实现步骤：
 * 1.导包：import java.util.Scanner;
 * 2.Scanner 的实例化 : Scanner scan = new Scanner(System.in);
 * 3.调用Scanner类的相关方法。来获取指定类型的变量
 * 如何从键盘获取不同类型的变量：需要使用Scanner类
 * <p>
 * 具体实现步骤：
 * 1.导包：import java.util.Scanner;
 * 2.Scanner 的实例化 : Scanner scan = new Scanner(System.in);
 * 3.调用Scanner类的相关方法。来获取指定类型的变量
 * 如何从键盘获取不同类型的变量：需要使用Scanner类
 * <p>
 * 具体实现步骤：
 * 1.导包：import java.util.Scanner;
 * 2.Scanner 的实例化 : Scanner scan = new Scanner(System.in);
 * 3.调用Scanner类的相关方法。来获取指定类型的变量
 */

/** 如何从键盘获取不同类型的变量：需要使用Scanner类
 *
 * 具体实现步骤：
 * 1.导包：import java.util.Scanner;
 * 2.Scanner 的实例化 : Scanner scan = new Scanner(System.in);
 * 3.调用Scanner类的相关方法。来获取指定类型的变量
 *
 *
 * 注意：
 * 需要根据相应的方法，来输入指定类型的值，如果输入的数据类型与要求的类型不匹配时，会报异常：InputMisMatchExeption
 * */

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scan.next();


        System.out.println(name);
        System.out.println("请输入你的芳龄");

        int num = scan.nextInt();
        System.out.println(num);

        System.out.println("请输入你的体重");
        double weighr = scan.nextDouble();
        System.out.println(weighr);

        System.out.println("你是否相中我了呢？ （ture/false）");
        boolean islove = scan.nextBoolean();

        // 对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
        System.out.println("请输入你的性别：（男/女）");
        String gender = scan.next();
        char genderchar = gender.charAt(0);// 获取索引为0的位置上的字符
        System.out.println(genderchar);
    }

}
