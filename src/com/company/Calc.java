package com.company;

public enum Calc {
    SUM(){
        public String print(){
            return "Сумму";
        }
        public String result(double x, double y)throws Exceptions{
            double a = setX(x)+setY(y);
            System.out.println("Ваш результат: "+a);
            System.out.println(" ");
            return "";
        }
    },
    MIN(){
        public String print(){
            return "Минус";
        }
        public String result(double x, double y)throws Exceptions{
            double a = setX(x)-setY(y);
//            System.out.println("Ваш результат: "+a);
//            System.out.println(" ");
            String str = Double.toString(a);
            return str;
        }
    },
    DEL(){
        public String print(){
            return "Деление";
        }
        public String result(double x, double y)throws Exceptions{
            if(getY(y)==0){
                System.out.println("На 0 не делят \n попробуй еще");
                Main.main();
            }

            double a = setX(x)/setY(y);
            System.out.println("Ваш результат: "+a);
            System.out.println(" ");
            return "a";
        }
    },
    MUL(){
        public String print(){
            return "Умножение";
        }
        public String result(double x, double y) throws Exceptions {
            double a = setX(x)*setY(y);
            System.out.println("Ваш результат: "+a);
            System.out.println(" ");
            return "a";
        }
    };
    private double x;
    private double y;


    public abstract String result(double x,double y)throws Exceptions;
    public abstract String print();

    public double getX(double x) {
        return x;
    }

    public double setX(double x) {
       return this.x = x;
    }

    public double getY(double y) {
        return y;
    }

    public double setY(double y)throws Exceptions{
        if (DEL.getY(y)==0) {
            throw new Exceptions("Все равно не прокатило");
        }
        return this.y = y;
    }

}

