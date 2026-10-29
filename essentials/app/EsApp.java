package essentials.app;

import android.app.Application;
import java.lang.invoke.VarHandle;
import java.util.Map;
import p000.C1053q;
import p000.dg4;
import p000.od4;
import p000.sw2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class EsApp extends Application {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f18450c = 0;

    /* JADX INFO: renamed from: a */
    public boolean f18451a;

    /* JADX INFO: renamed from: b */
    public final dg4 f18452b;

    public EsApp() {
        C1053q c1053q = new C1053q((byte) 23);
        c1053q.f28113b = this;
        VarHandle.storeStoreFence();
        this.f18452b = new dg4(c1053q);
    }

    /* JADX INFO: renamed from: a */
    public static final String m5325a(sw2 sw2Var, String str) {
        Integer numM9044Y;
        String str2 = (String) ((Map) sw2Var.getValue()).get(str);
        if (str2 == null || (numM9044Y = od4.m9044Y(str2)) == null) {
            return "-";
        }
        return (numM9044Y.intValue() / 1024) + " MB";
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
    }
}
