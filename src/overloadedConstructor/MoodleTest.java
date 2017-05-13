package overloadedConstructor;
import java.util.Date;

public class MoodleTest extends Test {
	private Date open;
	private Date closed;
	private String password;
	
	public MoodleTest(String name, String type, int weighting, int numQuestions, int duration, Date open, Date closed, String password){
		super(name, type, weighting, numQuestions, duration);
		this.open = open;
		this.closed = closed;
		this.password = password;
	}

	public Date getOpen() {
		return open;
	}

	public void setOpen(Date open) {
		this.open = open;
	}

	public Date getClosed() {
		return closed;
	}

	public void setClosed(Date closed) {
		this.closed = closed;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
