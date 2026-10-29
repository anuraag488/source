package p000;

import java.util.Set;

/* JADX INFO: renamed from: qk */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1074qk {
    /* JADX INFO: renamed from: a */
    Set mo9894a();

    void connect(InterfaceC1198tx interfaceC1198tx);

    void disconnect(String str);

    ed1[] getAvailableFeatures();

    void getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(gz1 gz1Var, Set set);

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(wd3 wd3Var);

    boolean requiresSignIn();
}
