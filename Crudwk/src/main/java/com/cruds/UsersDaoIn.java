package com.cruds;

import java.util.Date;

public interface UsersDaoIn {
	public void regis(String usN,String psw,String emil,String sx,Date det);
	public boolean logi(String usr,String pse);

}
