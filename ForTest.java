/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-07 11:29
 */

/** for循环结构的使用
 *  一、循环结构的四个要素
 *  ①初始化条件
 *  ②循环条件 --> 是 boolean类型
 *  ③循环体
 *  ④迭代条件
 *  二、佛如循环的结构
 *  for(①；②；④){
 *      ③
 *  }
 *
 * 执行过程： ①-②-③ -④-②-③-④- ...-②
 * */
public class ForTest {
    public static void main(String[] args) {
        for(int i=1;i<=5; i++){
            System.out.println("hello world");
        }
        // i:在for循环内有效。出了for循环就失效了。

        int num = 1;
        for(System.out.println('a'); num <=3; System.out.println('c'), num++){
            System.out.println('b');
        }

        //例题：遍历100以内的偶数
        int sum = 0;// 记录所有偶数的和
        int counut = 0;// 记录偶数的个数
        for (int i = 1; i <= 100; i++) {
            if ( i % 2 == 0) {
                System.out.println(i);
                sum +=i;
                counut++;
            }
        }
        System.out.println(sum);
        System.out.println(counut);
    }
}
