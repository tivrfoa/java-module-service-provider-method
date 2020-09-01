module msg.service.provider.swingclass {
    requires java.desktop;

    exports msg.provider.swingclass;
    uses msg.provider.swingclass.Vertx;
    
    provides msg.provider.swingclass.Vertx with msg.provider.swingclass.MsgServiceProvider;
}
