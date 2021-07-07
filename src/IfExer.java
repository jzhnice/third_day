/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-06 10:28
 */

/** 我家的狗5岁了，5岁的狗相当于人类多大呢？
 *其实，狗的前两年每 一年相当于人类的10.5岁，之后每增加一年就增加四岁。
 *那么5岁的狗 相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
 编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人
 类的年龄。如果用户输入负数，请显示一个提示信息。
 */
public class IfExer {
    public static void main(String[] args) {
        int x = 4;
        int y = 1;
        if (x > 2)
            if (y > 2)
                System.out.println(x + y);
            //System.out.println("atguigu");
            else  // 就近原则
            System.out.println("x is " + x);
//         课后练习3：测试狗的年龄
        int  doaAge = 6;
        if(doaAge >= 0 && doaAge <= 2){
            System.out.println("相当于人的年龄"+ doaAge *10.5);
        }
        else if (doaAge > 2){
            System.out.println("相当于人的年龄"+ ((2 *10.5)+(doaAge - 2)*4));
        }else  {
            System.out.println("狗狗还没出生呢！");
        }


        // 课后练习4：如何获取一个随机数：10-99
        int value = (int)(Math.random()*90+10);
        System.out.println(value);
        //公式：[a,b]:(int)(Math.random()*(b-a+1)+a)


    }

}
