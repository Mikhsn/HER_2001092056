/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HER_nobp.controller;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import HER_nobp.DAO.*;
import HER_nobp.model.*;
import HER_nobp.view.*;


/**
 *
 * @author LENOVO
 */
public class ServiceController {
    private FormService formService;
    private ServiceDao serviceDao;
    private Service service;
    
    public ServiceController(FormService formService){
        this.formService = formService;
        serviceDao = new ServiceDaoImp1();
    }
            
    public void bersihForm(){
        formService.getTxtKode_trans().setText("");
        formService.getTxtTgl_trans().setText("");
        formService.getTxtPelanggan().setText("");
        formService.getTxtJenis_service().setText("");
        formService.getTxtDiskon().setText("");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formService.getTblService().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Service> listService = serviceDao.getAllService();
        for(Service service : listService){
            Object[] data={
                service.getKode_trans(),
                service.getNama(),
                service.getAlamat()
            };
            tabelModel.addRow(data);
        }
    }
    
    public void getService(){
        int index = formService.getTblService().getSelectedRow();
        service = serviceDao.getService(index);
        if(service != null){
            formService.getTxtKode_trans().setText(service.getKode_trans());
            formService.getTxt().setText(service.getNama());
            formService.getTxtAlamat().setText(service.getAlamat());
        }
    }
    
    public void saveService(){
        service = new Service();
        service.setNobp(formService.getTxtNobp().getText());
        service.setNama(formService.getTxtNama().getText());
        service.setAlamat(formService.getTxtAlamat().getText());
        serviceDao.save(service);
        JOptionPane.showMessageDialog(formService, "Entri Data Ok!");
    }
    
    public void deleteService(){
        int index = formService.getTblService().getSelectedRow();
        serviceDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formService, "Delete Ok!");
    }
    
    public void UpdateService() {
        int index = formService.getTblService().getSelectedRow();
        service.setNobp(formService.getTxtNobp().getText());
        service.setNama(formService.getTxtNama().getText());
        service.setAlamat(formService.getTxtAlamat().getText());
        serviceDao.update(index, service);
        javax.swing.JOptionPane.showMessageDialog(formService, "Update Ok!");
    }
}
