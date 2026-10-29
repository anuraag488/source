package p000;

import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ma */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0902ma implements w20, InterfaceC0976oa, gx0 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C0939na f24777a;

    @Override // p000.gx0
    /* JADX INFO: renamed from: c */
    public void mo6188c(bi3 bi3Var) {
        C0939na c0939na = this.f24777a;
        ig1 ig1Var = ig1.f21399w;
        ig1Var.m6798m("AnalyticsConnector now available.", null);
        InterfaceC0828ka interfaceC0828ka = (InterfaceC0828ka) bi3Var.get();
        ar3 ar3Var = new ar3((byte) 19);
        ar3Var.f14813b = interfaceC0828ka;
        VarHandle.storeStoreFence();
        z32 z32Var = new z32((byte) 8);
        C0865la c0865la = (C0865la) interfaceC0828ka;
        ia5 ia5VarM7884b = c0865la.m7884b("clx", z32Var);
        if (ia5VarM7884b == null) {
            ig1Var.m6798m("Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            ia5VarM7884b = c0865la.m7884b("crash", z32Var);
            if (ia5VarM7884b != null) {
                ig1Var.m6802q("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (ia5VarM7884b == null) {
            ig1Var.m6802q("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        ig1Var.m6798m("Registered Firebase Analytics listener.", null);
        ar3 ar3Var2 = new ar3((byte) 10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        s00 s00Var = new s00();
        s00Var.f29782d = new Object();
        s00Var.f29779a = ar3Var;
        s00Var.f29780b = (short) 500;
        s00Var.f29781c = timeUnit;
        VarHandle.storeStoreFence();
        synchronized (c0939na) {
            try {
                ArrayList arrayList = c0939na.f25593c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ar3Var2.mo3138f((op0) obj);
                }
                z32Var.f35739c = ar3Var2;
                z32Var.f35738b = s00Var;
                c0939na.f25592b = ar3Var2;
                c0939na.f25591a = s00Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.w20
    /* JADX INFO: renamed from: f */
    public void mo3138f(op0 op0Var) {
        C0939na c0939na = this.f24777a;
        synchronized (c0939na) {
            try {
                if (c0939na.f25592b instanceof yz0) {
                    c0939na.f25593c.add(op0Var);
                }
                c0939na.f25592b.mo3138f(op0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0976oa
    /* JADX INFO: renamed from: k */
    public void mo3143k(Bundle bundle) {
        this.f24777a.f25591a.mo3143k(bundle);
    }
}
