package com.cruds;

import java.util.List;

public interface BikeDaoIn {
	public void addbik(Bikes bi);
	public List<Bikes> getlist();
	public void delt(int dId );
	public Bikes getbik(int uId);
	public void updat(Bikes b6);

}
