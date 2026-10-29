package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface cg0 {
    /* JADX INFO: renamed from: a */
    default Object mo4017a(Class cls) {
        return mo4023g(ni3.m8779a(cls));
    }

    /* JADX INFO: renamed from: b */
    bi3 mo4018b(ni3 ni3Var);

    /* JADX INFO: renamed from: c */
    default Set mo4019c(ni3 ni3Var) {
        return (Set) mo4018b(ni3Var).get();
    }

    /* JADX INFO: renamed from: d */
    default bi3 mo4020d(Class cls) {
        return mo4022f(ni3.m8779a(cls));
    }

    /* JADX INFO: renamed from: e */
    z53 mo4021e(ni3 ni3Var);

    /* JADX INFO: renamed from: f */
    bi3 mo4022f(ni3 ni3Var);

    /* JADX INFO: renamed from: g */
    default Object mo4023g(ni3 ni3Var) {
        bi3 bi3VarMo4022f = mo4022f(ni3Var);
        if (bi3VarMo4022f == null) {
            return null;
        }
        return bi3VarMo4022f.get();
    }
}
