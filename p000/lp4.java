package p000;

import java.lang.invoke.VarHandle;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lp4 implements kp4 {

    /* JADX INFO: renamed from: a */
    public Set f24269a;

    /* JADX INFO: renamed from: b */
    public C0588dv f24270b;

    /* JADX INFO: renamed from: c */
    public mp4 f24271c;

    /* JADX INFO: renamed from: a */
    public final C1122rv m8072a(String str, j81 j81Var, vo4 vo4Var) {
        Set set = this.f24269a;
        if (!set.contains(j81Var)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", j81Var, set));
        }
        C0588dv c0588dv = this.f24270b;
        mp4 mp4Var = this.f24271c;
        C1122rv c1122rv = new C1122rv((byte) 11, false);
        c1122rv.f29651b = c0588dv;
        c1122rv.f29652c = str;
        c1122rv.f29653d = j81Var;
        c1122rv.f29654e = vo4Var;
        c1122rv.f29655f = mp4Var;
        VarHandle.storeStoreFence();
        return c1122rv;
    }
}
