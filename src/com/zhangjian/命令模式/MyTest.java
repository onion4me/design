package com.zhangjian.命令模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {
    public static void main(String[] args) {

        // 1：把命令和真正的实现组合起来，相当于在组装机器，
        // 把机箱上按钮的连接线插接到主板上。
        MainBoardApi mainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoard);

        // 2：为机箱上的按钮设置对应的命令，让按钮知道该干什么
        Box box = new Box();

        box.setOpenCommand(openCommand);
        // 3：然后模拟按下机箱上的按钮
        box.openButtonPressed();
        // 结果
        // 技嘉主板现在正在开机，请等候
        // 接通电源......
        // 设备检查......
        // 装载系统......
        // 机器正常运转起来......
        // 机器已经正常打开，请操作
    }
}
