package Entity;

public class Customer 
{
		private String cname;
		private int cid;
		private long cphno;
		private String cemail;
		private int cage;
		private double camt;
		public double getCamt() {
			return camt;
		}

		public void setCamt(double camt) {
			this.camt = camt;
		}

		public void setCage(int cage) {
			this.cage = cage;
		}

		private  Address caddress;

		public Customer(String cname, int cid, long cphno, String cemail, int cage, Address caddress) 
		{
			this.cname = cname;
			this.cid = cid;
			this.cphno = cphno;
			this.cemail = cemail;
			this.cage = cage;
			this.caddress = caddress;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public long getCphno() {
			return cphno;
		}

		public void setCphno(long cphno) {
			this.cphno = cphno;
		}

		public String getCemail() {
			return cemail;
		}

		public void setCemail(String cemail) {
			this.cemail = cemail;
		}

		public int getCage() {
			return cage;
		}

		public void setCpan(int cage) {
			this.cage = cage;
		}

		public Address getCaddress() {
			return caddress;
		}

		public void setCaddress(Address caddress) {
			this.caddress = caddress;
		}

		@Override
		public String toString() {
			return "Customer [cname=" + cname + ", cid=" + cid + ", cphno=" + cphno + ", cemail=" + cemail + ", cage="
					+ cage + ", caddress=" + caddress + "]";
		}
	}