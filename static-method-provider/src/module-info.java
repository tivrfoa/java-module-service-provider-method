module msg.service.provider.swingtwo {
    requires msg.service.api;
    requires java.desktop;
    provides msg.service.MsgService with msg.provider.swingtwo.MsgServiceProvider;
}
