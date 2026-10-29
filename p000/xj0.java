package p000;

import java.lang.invoke.VarHandle;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xj0 implements xm0, n60 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34312a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f34313b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f34314c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f34315d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f34316e;

    @Override // p000.n60
    /* JADX INFO: renamed from: f */
    public Object mo4036f(m60 m60Var) {
        Executor executor = (Executor) this.f34312a;
        r50 r50Var = (r50) this.f34313b;
        String str = (String) this.f34314c;
        wp1 wp1Var = (wp1) this.f34315d;
        qv2 qv2Var = (qv2) this.f34316e;
        s61 s61Var = new s61((byte) 1);
        s61Var.f29932b = r50Var;
        s61Var.f29933c = str;
        s61Var.f29934d = wp1Var;
        s61Var.f29935e = qv2Var;
        s61Var.f29936f = m60Var;
        VarHandle.storeStoreFence();
        executor.execute(s61Var);
        return ju4.f22634a;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: h */
    public Object mo3681h(nr6 nr6Var) {
        wo5 wo5Var = (wo5) this.f34312a;
        nr6 nr6Var2 = (nr6) this.f34313b;
        nr6 nr6Var3 = (nr6) this.f34314c;
        Date date = (Date) this.f34315d;
        HashMap map = (HashMap) this.f34316e;
        if (!nr6Var2.m8826j()) {
            return y62.m12935A(new xg1("Firebase Installations failed to get installation ID for fetch.", nr6Var2.m8823g()));
        }
        if (!nr6Var3.m8826j()) {
            return y62.m12935A(new xg1("Firebase Installations failed to get installation auth token for fetch.", nr6Var3.m8823g()));
        }
        try {
            zj0 zj0VarM12346a = wo5Var.m12346a((String) nr6Var2.m8824h(), ((C0774iu) nr6Var3.m8824h()).f21777a, date, map);
            if (zj0VarM12346a.f36143a != 0) {
                return y62.m12936B(zj0VarM12346a);
            }
            nr6 nr6VarM11573d = ((uj0) wo5Var.f33571f).m11573d(zj0VarM12346a.f36144b);
            Executor executor = (Executor) wo5Var.f33568c;
            C1040pn c1040pn = new C1040pn((byte) 3);
            c1040pn.f27754b = zj0VarM12346a;
            VarHandle.storeStoreFence();
            return nr6VarM11573d.m8827k(executor, c1040pn);
        } catch (yg1 e) {
            return y62.m12935A(e);
        }
    }
}
