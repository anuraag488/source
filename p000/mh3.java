package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mh3 implements m24 {

    /* JADX INFO: renamed from: a */
    public String f24917a;

    /* JADX INFO: renamed from: b */
    public u50 f24918b;

    /* JADX INFO: renamed from: c */
    public t50 f24919c;

    /* JADX INFO: renamed from: d */
    public qc2 f24920d;

    /* JADX INFO: renamed from: e */
    public j63 f24921e;

    /* JADX INFO: renamed from: f */
    public Integer f24922f;

    /* JADX INFO: renamed from: b */
    public static mh3 m8323b(String str, t50 t50Var, qc2 qc2Var, j63 j63Var, Integer num) throws GeneralSecurityException {
        if (j63Var == j63.f22047e) {
            if (num != null) {
                xy4.m12788q("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            xy4.m12788q("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        u50 u50VarM13264a = yv4.m13264a(str);
        mh3 mh3Var = new mh3();
        mh3Var.f24917a = str;
        mh3Var.f24918b = u50VarM13264a;
        mh3Var.f24919c = t50Var;
        mh3Var.f24920d = qc2Var;
        mh3Var.f24921e = j63Var;
        mh3Var.f24922f = num;
        VarHandle.storeStoreFence();
        return mh3Var;
    }

    @Override // p000.m24
    /* JADX INFO: renamed from: a */
    public final u50 mo8194a() {
        return this.f24918b;
    }
}
