module msg.service.provider.swing {
    requires msg.service.api;
    requires java.desktop;
    provides msg.service.MsgService with msg.provider.swing.MsgServiceImpl;
}
