package com.saket.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
          //  divide(a, b);

            //mimiking
            String name = "Saket";
            if(name.equals("Saket")){
                throw new MyException("Name is Saket");
            }

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("normal exception");
        }
        finally {
            System.out.println("this will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        //return a / b;
        if (b == 0) {
            throw new ArithmeticException("Plz do not divide by zero");

        }
        return a / b;
    }
}


