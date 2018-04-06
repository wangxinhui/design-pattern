package com.birdgePattern;

public class Client {
    public static void main(String[] args) {
//        Image image = new JPGImage();
//        ImageImp imageImp = new WindowsImage();
//        image.setImageImp(imageImp);
//        image.parseFile("ee");

        int a , b, c;
        for(a=-100;a<=120;a++){
            for (b=-100;b<=120;b++){
                for (c=-100;c<=120;c++){
                    if (a + 3*b + 5*c == 120){
                        System.out.println("a :" +a +" b:" + b + " c:" +c);
                    }
                }
            }
        }
    }
}
