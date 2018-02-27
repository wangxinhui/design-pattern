package com.chapter0;

public class Main {

    public static void main(String[] args) {
        AbstractChart chart = new BarChart();
        ChartDisplay chartDisplay = new ChartDisplay();
        chartDisplay.setChart(chart);
        chartDisplay.display();
    }
}
