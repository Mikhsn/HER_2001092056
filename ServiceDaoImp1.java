/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HER_nobp.DAO;
import java.util.ArrayList;
import java.util.List;
import HER_nobp.model.Service;

/**
 *
 * @author LENOVO
 */
public class ServiceDaoImp1 implements ServiceDao{
    List<Service> data = new ArrayList<>();
    
    @Override
    public Service save(Service service){
        data.add(service);
        return service;
    }
    
    public Service update(int index, Service service){
        data.set(index, service);
        return service;
    }
    
    public Service delete(int index){
        return data.remove(index);
    }
    
    public Service getService (int index){
        return data.get(index);
    }
    
    public List<Service> getAllService(){
        return data;
    }
}
