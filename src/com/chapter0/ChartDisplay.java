package com.chapter0;

/**
 * @Author: by Administrator on 2018/2/27.
 */
public class ChartDisplay {
    private AbstractChart chart;

    public void setChart(AbstractChart chart) {
        this.chart = chart;
    }

    public void display(){
        chart.display();
    }
}
