package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class re2 implements vz4 {

    /* JADX INFO: renamed from: a */
    public final tz4 f29209a;

    public re2(tz4 tz4Var) {
        this.f29209a = tz4Var;
        q50 q50Var = mc0.f24810a;
        q50[] q50VarArr = {new q50(0.0f, 100.0f), new q50(-128.0f, 128.0f), new q50(-128.0f, 128.0f)};
        cu2 cu2Var = new cu2(2);
        cu2Var.m4168a(q50VarArr);
        q50 q50Var2 = mc0.f24810a;
        ArrayList arrayList = cu2Var.f16495a;
        arrayList.add(q50Var2);
        kx5.m7694Y(arrayList.toArray(new q50[arrayList.size()]));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof re2) {
            return z62.m13387o(this.f29209a, ((re2) obj).f29209a);
        }
        return false;
    }

    @Override // p000.vz4
    /* JADX INFO: renamed from: f */
    public final tz4 mo5130f() {
        throw null;
    }

    public final int hashCode() {
        return this.f29209a.hashCode();
    }

    public final String toString() {
        return "LABColorSpace(" + this.f29209a + ')';
    }
}
