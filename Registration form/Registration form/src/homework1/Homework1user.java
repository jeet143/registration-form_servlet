package homework1;

public class Homework1user {

	private String FIRSTNAME,LASTNAME,PASSWORD,REENTERPASSWORD,EMAIL,ZIPCODE;
	
	public void homeworkuser1(String FIRSTNAME,String LASTNAME,String PASSWORD,String REENTERPASSWORD,String EMAIL,String ZIPCODE){
		
		this.FIRSTNAME=FIRSTNAME;
		this.LASTNAME=LASTNAME;
		this.PASSWORD=PASSWORD;
		this.REENTERPASSWORD=REENTERPASSWORD;
		this.EMAIL=EMAIL;
		this.ZIPCODE=ZIPCODE;
		
	}

	public void StoreUser() {
		// TODO Auto-generated constructor stub
	}

	public String getFIRSTNAME() {
		return FIRSTNAME;
	}

	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}

	public String getLASTNAME() {
		return LASTNAME;
	}

	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getREENTERPASSWORD() {
		return REENTERPASSWORD;
	}

	public void setREENTERPASSWORD(String rEENTERPASSWORD) {
		REENTERPASSWORD = rEENTERPASSWORD;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getZIPCODE() {
		return ZIPCODE;
	}

	public void setZIPCODE(String zIPCODE) {
		ZIPCODE = zIPCODE;
	}

	public static String get() {
		// TODO Auto-generated method stub
		return null;
	}

	
}