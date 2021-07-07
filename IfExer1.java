import java.util.Scanner;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-07 12:16
 */

    /**
     * 大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出 一定的条件：高：180cm以上；富：财富1千万以上；帅：是。
     * 如果这三个条件同时满足，则：“我一定要嫁给他!!!”
     * 如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
     * 如果三个条件都不满足，则：“不嫁！”
     * */
    public class IfExer1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("请输入你的身高:（cm）");
            int height = scan.nextInt();

            System.out.println("请输入你的财富:(千万)");
            double wealth = scan.nextDouble();

            //方式1
        /*System.out.println("请输入你是否帅:(true/false)");
        boolean isshuai = scan.nextBoolean();
        if ( height >=189 && wealth >=1 &&isshuai) {
            System.out.println("我一定要嫁给他");
        }else if (height >= 180 || wealth >= 1 || isshuai){
            System.out.println("嫁吧，比上不足，比下有余");
        }else{
            System.out.println("不嫁！");
        }*/

            // 方式二：
            System.out.println("请输入你是否帅:(是/否)");
            String isshuai = scan.next();
            if ( height >=189 && wealth >=1 && isshuai.equals("是")) {
                System.out.println("我一定要嫁给他");
            }else if (height >= 180 || wealth >= 1 || isshuai.equals("是")){
                System.out.println("嫁吧，比上不足，比下有余");
            }else{
                System.out.println("不嫁！");
            }

        }
    }
