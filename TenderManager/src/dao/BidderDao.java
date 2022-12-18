package dao;

import java.util.List;

import bean.BidderBean;
import exception.BidderException;

public interface BidderDao {

	public String acceptBid(int bid, int tid,int vid)throws BidderException;
	
	public String rejectBid(int bid)throws BidderException;
	
	public String bidTendor(int bid,int vid , int tid , double bidamount)throws BidderException;
	
	public List<BidderBean> getAllBidsOnTendor(int tid)throws BidderException;
	
	public List<BidderBean> getAllBidsOfVendor(int vid)throws BidderException;
	
}