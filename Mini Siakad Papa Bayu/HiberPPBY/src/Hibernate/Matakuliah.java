package Hibernate;
// Generated Nov 23, 2016 2:43:18 PM by Hibernate Tools 4.3.1



/**
 * Matakuliah generated by hbm2java
 */
public class Matakuliah  implements java.io.Serializable {


     private String kodemk;
     private String namamk;
     private String sks;

    public Matakuliah() {
    }

	
    public Matakuliah(String kodemk, String namamk) {
        this.kodemk = kodemk;
        this.namamk = namamk;
    }
    public Matakuliah(String kodemk, String namamk, String sks) {
       this.kodemk = kodemk;
       this.namamk = namamk;
       this.sks = sks;
    }
   
    public String getKodemk() {
        return this.kodemk;
    }
    
    public void setKodemk(String kodemk) {
        this.kodemk = kodemk;
    }
    public String getNamamk() {
        return this.namamk;
    }
    
    public void setNamamk(String namamk) {
        this.namamk = namamk;
    }
    public String getSks() {
        return this.sks;
    }
    
    public void setSks(String sks) {
        this.sks = sks;
    }




}


