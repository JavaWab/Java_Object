import java.util.Date;

import com.nqsky.meap.uc.ldap.LdapFactory;

public class T {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Date(System.currentTimeMillis()).getHours());
		LdapFactory.getInstance().getLdap();
	}

}
