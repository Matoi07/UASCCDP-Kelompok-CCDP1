/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar.strategy;

/**
 *
 * @author Adhitya Dwi Cahyana
 */
public class HitungContext {
    private Strategy strategy;
    
    public HitungContext(Strategy strategy){
        this.strategy = strategy;
    }
    public String executeStrategy(int hasil){
        return strategy.hitung(hasil);
    }
}
