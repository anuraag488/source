package p000;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nw2 {

    /* JADX INFO: renamed from: b */
    public static final nw2 f26151b;

    /* JADX INFO: renamed from: a */
    public AtomicReference f26152a;

    static {
        try {
            f26151b = (nw2) new xd2((byte) 15).m12671j();
        } catch (Exception e) {
            wb1.m12194m(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final se0 m8871a(m24 m24Var) throws GeneralSecurityException {
        r24 r24Var = (r24) this.f26152a.get();
        r24Var.getClass();
        p24 p24Var = new p24(m24Var.getClass(), m24Var.mo8194a());
        HashMap map = r24Var.f28971b;
        if (map.containsKey(p24Var)) {
            return ((dd2) map.get(p24Var)).f16995b.mo4673f(m24Var);
        }
        xy4.m12793v("No Key Parser for requested key type ", p24Var, " available");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8872b(dd2 dd2Var) {
        C1283w7 c1283w7 = new C1283w7((r24) this.f26152a.get());
        dd2Var.getClass();
        p24 p24Var = new p24(mh3.class, dd2Var.f16994a);
        HashMap map = (HashMap) c1283w7.f33128d;
        if (map.containsKey(p24Var)) {
            dd2 dd2Var2 = (dd2) map.get(p24Var);
            if (!dd2Var2.equals(dd2Var) || dd2Var != dd2Var2) {
                xd2.m12666m(p24Var, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            map.put(p24Var, dd2Var);
        }
        this.f26152a.set(c1283w7.m12146v());
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8873c(fd2 fd2Var) {
        C1283w7 c1283w7 = new C1283w7((r24) this.f26152a.get());
        q24 q24Var = new q24(fd2Var.f18922a, mh3.class);
        HashMap map = (HashMap) c1283w7.f33127c;
        if (map.containsKey(q24Var)) {
            fd2 fd2Var2 = (fd2) map.get(q24Var);
            if (!fd2Var2.equals(fd2Var) || fd2Var != fd2Var2) {
                xd2.m12666m(q24Var, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            map.put(q24Var, fd2Var);
        }
        this.f26152a.set(c1283w7.m12146v());
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m8874d(v73 v73Var) {
        C1283w7 c1283w7 = new C1283w7((r24) this.f26152a.get());
        v73Var.getClass();
        p24 p24Var = new p24(nh3.class, v73Var.f32446a);
        HashMap map = (HashMap) c1283w7.f33126b;
        if (map.containsKey(p24Var)) {
            v73 v73Var2 = (v73) map.get(p24Var);
            if (!v73Var2.equals(v73Var) || v73Var != v73Var2) {
                xd2.m12666m(p24Var, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            map.put(p24Var, v73Var);
        }
        this.f26152a.set(c1283w7.m12146v());
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m8875e(x73 x73Var) {
        C1283w7 c1283w7 = new C1283w7((r24) this.f26152a.get());
        q24 q24Var = new q24(x73Var.f34042a, nh3.class);
        HashMap map = (HashMap) c1283w7.f33129e;
        if (map.containsKey(q24Var)) {
            x73 x73Var2 = (x73) map.get(q24Var);
            if (!x73Var2.equals(x73Var) || x73Var != x73Var2) {
                xd2.m12666m(q24Var, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            map.put(q24Var, x73Var);
        }
        this.f26152a.set(c1283w7.m12146v());
    }
}
