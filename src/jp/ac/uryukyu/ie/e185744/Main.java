package jp.ac.uryukyu.ie.e185744;

public class Main {
    public static void main(String[] args){

        try {
            //処理したいコード
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            //IOExceptionが起きたときの処理
            System.out.println("NullPointerExceptionが発生");
            System.out.println(e.getMessage());
        }
    }
}
