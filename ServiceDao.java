/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HER_nobp.DAO;
import HER_nobp.model.Service;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface ServiceDao {
    Service save(Service service);
    Service update(int index, Service service);
    Service delete(int index);
    Service getService(int index);
    List<Service> getAllService();
}
