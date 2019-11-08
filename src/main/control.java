package main;

import inPut.inPut;
import inPut.outPut;
import java.util.ArrayList;
import java.util.Scanner;

public class control {
    public void key() {
        ArrayList<String> list = new ArrayList<String>();
        inPut input = new inPut();
        outPut output = new outPut();
        Scanner in = new Scanner(System.in);
        System.out.println("乱七八糟文章生成器即没时间写红岩作业弄出来的生成器1.0");

        System.out.println("你左手边的第一个东西是什么：");
        input.setYourName(in.nextLine());
        System.out.println("随便给一个名词：");
        input.setComputerName(in.nextLine());
        System.out.println("你之前在干什么：");
        input.setSth(in.nextLine());
        System.out.println("你最喜欢的颜色是什么：");
        input.setColor(in.nextLine());
        System.out.println("双十一准备买什么：");
        input.setSth2(in.nextLine());

        list.add("在沙漠里快要饿死了，这时他捡到了");                       //0
        list.add("说：“ 我只可以实现你三个愿望，快说吧，我赶时间。”");       //1
        list.add("说：“我要");                                          //2
        list.add("。”");                                              //3
        list.add("说：“彳亍，给我整傻了，不愧是你。");                  //4
        list.add("你还有三个愿望。”");                              //5
        list.add("又说：“我想穿");                                //6
        list.add("的");                                          //7
        list.add("。”");                                          //8
        list.add("说：“这都行，重庆邮电大学还是你最成功，最后一个了，gkd。”");                  //9
        list.add("突然贴近了");                                  //10
        list.add("，左手轻轻挑起他的下巴，右手撑在后面的空气墙，微微一笑，说：“你猜我想要什么？”");//11
        list.add("陡然红了脸，一双水灵灵的眼睛不知看向何处，双手局促的放在胸前，茫然的看着");                              //12
        list.add("，说：“我。。。我不知道。”");                          //13
        list.add("越笑越猖狂，笑着笑着就哭了，说：“我想写完红岩作业。”");          //14
        list.add("愣了一下，冷着脸推开了");                    //15
        list.add("，说：“好了，你现在写完了。”");                //16
        try {


            output.println(input.getYourName(), list.get(0));
            System.out.print(input.getComputerName() + "。");
            output.println(input.getComputerName(), list.get(1));
            output.println(input.getYourName(), list.get(2));
            output.println(input.getSth(), list.get(3));
            output.println(input.getComputerName(), list.get(4));
            System.out.println(list.get(5));
            output.println(input.getYourName(), list.get(6));
            output.println(input.getColor(), list.get(7));
            output.println(input.getSth2(), list.get(8));
            output.println(input.getComputerName(), list.get(9));
            System.out.println(" ");
            output.println(input.getYourName(), list.get(10));
            output.println(input.getComputerName(), list.get(11));
            output.println(input.getComputerName(), list.get(12));
            output.println(input.getYourName(), list.get(13));
            System.out.println(" ");
            output.println(input.getYourName(), list.get(14));
            output.println(input.getComputerName(), list.get(15));
            output.println(input.getYourName(), list.get(16));
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}