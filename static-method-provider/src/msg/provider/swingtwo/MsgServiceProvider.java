package msg.provider.swingtwo;

import msg.service.MsgService;
import javax.swing.*;

public class MsgServiceProvider {

	public static MsgService provider() {
		return new MsgService() {
			@Override
			  public void showMessage(String msg) {
			      JOptionPane.showMessageDialog(null, "From Msg Provider!!!");
			  }
		};
	}
  
}


