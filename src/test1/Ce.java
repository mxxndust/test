package test1;

public class Ce {
	String proi;
	private boolean n;
	private boolean s;
	private boolean w;
	private boolean e;
	
	/*public Ce(String proi, boolean n, boolean s, boolean w, boolean e) {
		this.proi = proi;
		this.n = n;
		this.s = s;
		this.w = w;
		this.e = e;
	}*/
	public Ce(String proi) {
		this.proi = proi;
		//setProi("no");
	}

	/**
	 * @return the proi
	 */
	public String getProi() {
		return proi;
	}

	/**
	 * @param proi the proi to set
	 */
	public void setProi(String proi) {
		this.proi = proi;
	}

	/**
	 * @return the n
	 */
	public boolean isN() {
		return n;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(boolean n) {
		this.n = n;
	}

	/**
	 * @return the s
	 */
	public boolean isS() {
		return s;
	}

	/**
	 * @param s the s to set
	 */
	public void setS(boolean s) {
		this.s = s;
	}

	/**
	 * @return the w
	 */
	public boolean isW() {
		return w;
	}

	/**
	 * @param w the w to set
	 */
	public void setW(boolean w) {
		this.w = w;
	}

	/**
	 * @return the e
	 */
	public boolean isE() {
		return e;
	}

	/**
	 * @param e the e to set
	 */
	public void setE(boolean e) {
		this.e = e;
	}
	
	/*private boolean al;

	public boolean isAl() {
		return al;
	}

	public void setAl(boolean al) {
		this.al = al;
	}*/

}
