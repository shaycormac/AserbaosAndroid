package com.aserbao.aserbaosandroid.designMode.strategyMode.speed;

/**
 * Created by aserbao on 2018 2018/3/8.23:29
 * Email:aserbao@163.com
 * weixin: aserbao
 */

public class FastSpeed implements ISpeedBehavior{
    @Override
    public void speed() {
        System.err.println("My speed is Fast!");
    }
}
