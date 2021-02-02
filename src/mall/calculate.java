/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mall;

/**
 *
 * @author ken_0
 */
public class calculate {
    public double tshirt;
    public double oversize;
    public double jean;
    public double shirt;
    public double blazer;
    public double blouse;
    public double jacket;
    public double skirt;
    public double trouser;
    public double bomber;
    
    public double p_tshirt = 30;
    public double p_oversize = 50;
    public double p_jean = 100;
    public double p_shirt =79;
    public double p_blazer = 220;
    public double p_blouse = 100;
    public double p_jacket = 99;
    public double p_skirt = 99;
    public double p_trouser = 150;
    public double p_bomber = 220;
    
    public double getAmmount(){
        p_tshirt *= tshirt;
        p_oversize *= oversize;
        p_jean *= jean;
        p_shirt *= shirt;
        p_blazer *= blazer;
        p_blouse *= blouse;
        p_jacket *= jacket;
        p_skirt *= skirt;
        p_trouser *= trouser;
        p_bomber *= bomber;
        double total = p_tshirt+p_oversize+p_jean+p_shirt+p_blazer+p_blouse+p_jacket+p_skirt+p_trouser+p_bomber;
        return total;
    }
    
}
