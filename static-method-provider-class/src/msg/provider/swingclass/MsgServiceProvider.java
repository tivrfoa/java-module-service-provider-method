package msg.provider.swingclass;

import javax.swing.*;

public class MsgServiceProvider {

	public static Vertx provider() {
		return new Vertx() {
			@Override
			  public void showMessage(String msg) {
			      JOptionPane.showMessageDialog(null, "From Vertx Provider!!!");
			  }
		};
	}
  
}


