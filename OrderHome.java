package obs.order;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface OrderHome extends EJBHome {
   Order create() throws CreateException, RemoteException;
}
public int price;
public void show_data(int price)
{
   return price;
}

public int increase(int p)
{
   price+=p;
   return price;
}
