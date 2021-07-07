/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-06 17:16
 */

/**
 * 分支结构之二：switch-case
 * <p>
 * 1.格式
 * switch（表达式）{
 * case 常量1：
 * 执行语句1；
 * // break
 * case 常量2 ：
 * 执行语句2；
 * break；
 * ........
 * default:
 * 执行语句n;
 * //break；

 * }
 * 2.说明：
 * 1：根据switch表达式中的值。依次匹配各个case中的常量。一旦匹配成功，则进入相应的case结构中，调用其执行语句。
 * 当调用完执行语句以后，则仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字或此switch-case结构末尾结束为止
 * 2：break,可以使用在switch-case结构中，表示一旦执行到此关键字，就跳出switch-case结构中
 * 3：switch结构中的表达式，只能是如下6中数据类型之一
 * :byte\short \char int 枚举类型\string
 * 4:case 之后只能声明常量，不能生命范围
 * 5：break 关键字是可选的。
 * 6：default ：相当于if-else结构中的else
 *             default 结构是可选的。而且位置是灵活的 
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        int number = 1;
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("zero");
                break;
            case 3:
                System.out.println("one");
                break;
            default:
                System.out.println("other");
                break;
        }


        String season = "summer";
        switch (season) {
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            default:
                System.out.println("季节输入有误");
                break;

        }
        // 编译不通过
        /*int age = 10;
        switch(age){
            case age >18:
                System.out.println("成年了");
            default:
                System.out.println("未成年");
        }*/


    }
}
