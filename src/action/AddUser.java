package action;
import model.User;
import com.interf.Insert;
import com.interf.InsertImp;
import com.opensymphony.xwork2.ActionSupport;
public class AddUser extends ActionSupport {
User u;

public User getU() {
	return u;
}

public void setU(User u) {
	this.u = u;
}
public String execute() throws Exception{
	Insert insert=new InsertImp();
	int i=insert.adduser(u);
	if(i>0){return "success";}
	else return "error";
}
}
