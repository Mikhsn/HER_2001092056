/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HER_nobp.model;

/**
 *
 * @author LENOVO
 */
public class Service {
    public class Warnet {
        private String kode_trans;
        private String tgl_trans;
        private String pelanggan;
        private String jenis_service;
        private double biaya;
        private double diskon;
        private double total;    


        public String getKode_trans(){
            return kode_trans;
        }

        public void setKode_trans (String kode_trans){
            this.kode_trans = kode_trans;
        }

        public String getTgl_trans(){
            return tgl_trans;
        }

        public void setTgl_trans (String tgl_trans){
            this.tgl_trans = tgl_trans;
        }

        public String getPelanggan(){
            return pelanggan;
        }

        public void setPelanggan (String pelanggan){
            this.pelanggan = pelanggan;
        }   

        public String getJenis_service(){
            return jenis_service;
        }

        public void setJenis_servicd (String jenis_service){
            this.jenis_service = jenis_service;
        }

        public double getBiaya(){
            if(jenis_service == "1"){
                biaya = 50000;
            }
            else if(jenis_service == "2"){
                biaya = 60000;
            }
            return biaya;
        }

        public double getDiskon(){
            return diskon;
        }

        public void setDiskon (double diskon){
            this.diskon = diskon;
        }

        public double getTotal(){
            total = biaya -  diskon;
            return total;
        }
    
    }
}
