package msg.provider.swing;

import msg.service.MsgService;
import javax.swing.*;

public class MsgServiceImpl implements MsgService{
  @Override
  public void showMessage(String msg) {
      JOptionPane.showMessageDialog(null, msg);
  }
}


