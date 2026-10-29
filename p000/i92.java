package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class i92 {

    /* JADX INFO: renamed from: c */
    public static final h92 f21187c = new h92(new s92(false, false, q90.f28308c, true));

    /* JADX INFO: renamed from: a */
    public final s92 f21188a;

    /* JADX INFO: renamed from: b */
    public final js1 f21189b;

    public i92(s92 s92Var) {
        int i = lb5.f23923k;
        this.f21188a = s92Var;
        js1 js1Var = new js1();
        js1Var.f22555a = new ConcurrentHashMap(16);
        VarHandle.storeStoreFence();
        this.f21189b = js1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m6698a(jc2 jc2Var, aa2 aa2Var) {
        iv0 hb2Var;
        String str = null;
        if (aa2Var instanceof va2) {
            hb2Var = new mb2(this, (va2) aa2Var, jc2Var.mo15d(), str, 16);
        } else if (aa2Var instanceof n92) {
            hb2Var = new nb2(this, (n92) aa2Var);
        } else {
            if (!(aa2Var instanceof na2) && !aa2Var.equals(ra2.INSTANCE)) {
                C0670g.m5864c();
                return null;
            }
            hb2Var = new hb2(this, (fb2) aa2Var, null);
        }
        return hb2Var.mo6942b(jc2Var);
    }

    /* JADX INFO: renamed from: b */
    public final aa2 m6699b(jc2 jc2Var, Object obj) {
        ql3 ql3Var = new ql3();
        C0607ec c0607ec = new C0607ec((byte) 5);
        c0607ec.f17957b = ql3Var;
        VarHandle.storeStoreFence();
        new ib2(this, (yp1) c0607ec, (byte) 1).mo5920d(jc2Var, obj);
        Object obj2 = ql3Var.f28555a;
        if (obj2 != null) {
            return (aa2) obj2;
        }
        z62.m13366Y("result");
        throw null;
    }
}
