package entity;

import entity.Customer;
import entity.OrderLine;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-19T19:46:29")
@StaticMetamodel(AppOrder.class)
public class AppOrder_ { 

    public static volatile SingularAttribute<AppOrder, Integer> totalPrice;
    public static volatile SingularAttribute<AppOrder, String> form_msg;
    public static volatile ListAttribute<AppOrder, OrderLine> orderLine;
    public static volatile SingularAttribute<AppOrder, String> form_mail;
    public static volatile SingularAttribute<AppOrder, Long> id;
    public static volatile SingularAttribute<AppOrder, String> form_name;
    public static volatile SingularAttribute<AppOrder, Date> orderDate;
    public static volatile SingularAttribute<AppOrder, Customer> customer;

}