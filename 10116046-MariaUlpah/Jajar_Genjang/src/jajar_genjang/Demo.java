/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajar_genjang;

/**
 *
 * @author maria ulfah
 */
public class Demo {
    public static void showMessage(User user, String message) {
        System.out.println(new Demo().toString() + "[" + user.getName() + "]: " + message);
    }
}
