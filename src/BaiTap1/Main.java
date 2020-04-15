/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Nhan
 */
public class Main {
    public static void main(String[] args) {
        context context =new context();
        context.context(new Cong());
        System.out.println(context.tinh(75, 12));
        
        context context2 =new context();
        context2.context(new Tru());
        System.out.println(context2.tinh(54, 78));
        
         context context3 =new context();
        context3.context(new Nhan());
        System.out.println(context3.tinh(5, 10));
    }
}
