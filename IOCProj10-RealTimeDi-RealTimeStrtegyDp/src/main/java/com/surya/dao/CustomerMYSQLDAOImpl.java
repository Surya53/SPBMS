package com.surya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.surya.bo.CustomerBo;

public final class CustomerMYSQLDAOImpl implements ICustomerDAO {
	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY = "INSERT INTO REALTIMEDI_CUSTOMER (CUSTNAME,CUSTADDRS,PAMT,RATE,TIME,INTRAMOUNT) VALUES(?,?,?,?,?,?)";
	private DataSource ds;

	// alt+shift+s,o
	public CustomerMYSQLDAOImpl(DataSource ds) {
		System.out.println("CustMYSQLDAOImpl::1-param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBo bo) throws Exception {

		int count=0;
		try (Connection con = ds.getConnection();   // try with resource
			 PreparedStatement ps = con.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY))	{
			
			
			//set query param values
			ps.setString(1, bo.getCustName());
			ps.setString(2,bo.getCustAddrs());
            ps.setFloat(3, bo.getPamt());
            ps.setFloat(4, bo.getRate());
            ps.setFloat(5, bo.getTime());
            ps.setFloat(6, bo.getIntrestAmount());
            
            //Exceute Query
            count = ps.executeUpdate();
            
			
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;   //Exception Rethrowing
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;    //Exception Rethrowing
		}
			return count;
	}

}
