import java.rmi.*;
import java.util.*;

/**
 * The remote interface for a simple warehouse.
 *
 * @author Cay Horstmann
 * @version 1.0 2007-10-09
 */
public interface Warehouse extends Remote {
    double getPrice(String description) throws RemoteException;

    Product getProduct(List<String> keywords) throws RemoteException;
}
