package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e82 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ic2[] f17877d = {new jh3(h60.f20405a, e82.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0)};

    /* JADX INFO: renamed from: a */
    public final String f17878a;

    /* JADX INFO: renamed from: b */
    public final ThreadLocal f17879b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    public final lt0 f17880c;

    public e82(Context context, String str) {
        this.f17878a = str;
        d82 d82Var = new d82((byte) 0);
        d82Var.f16857b = this;
        VarHandle.storeStoreFence();
        t31 t31Var = new t31(d82Var);
        d82 d82Var2 = new d82((byte) 1);
        d82Var2.f16857b = this;
        VarHandle.storeStoreFence();
        pw0 pw0Var = l01.f23664a;
        um0 um0VarM13670b = zp0.m13670b(qs5.m10089N(gw0.f20149b, AbstractC0647fd.m5675m()));
        vd3 vd3Var = new vd3();
        vd3Var.f32533a = str;
        Object obj = new Object();
        vd3Var.f32534b = obj;
        VarHandle.storeStoreFence();
        ic2 ic2Var = f17877d[0];
        ud3 ud3Var = (ud3) vd3Var.f32535c;
        if (ud3Var == null) {
            synchronized (obj) {
                try {
                    if (((ud3) vd3Var.f32535c) == null) {
                        Context applicationContext = context.getApplicationContext();
                        List list = (List) d82Var2.invoke(applicationContext);
                        jp1 jp1Var = new jp1((byte) 13);
                        jp1Var.f22485b = applicationContext;
                        jp1Var.f22486c = vd3Var;
                        VarHandle.storeStoreFence();
                        vd3Var.f32535c = wv1.m12422l(t31Var, list, um0VarM13670b, jp1Var);
                    }
                    ud3Var = (ud3) vd3Var.f32535c;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f17880c = ud3Var;
    }
}
