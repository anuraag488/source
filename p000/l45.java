package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l45 implements vz4 {

    /* JADX INFO: renamed from: a */
    public final tz4 f23787a;

    public l45(tz4 tz4Var) {
        this.f23787a = tz4Var;
        mc0.m8272a("XYZ");
    }

    /* JADX INFO: renamed from: a */
    public final k45 m7833a(float f, float f2, float f3, float f4) {
        k45 k45Var = new k45();
        k45Var.f22886a = f;
        k45Var.f22887b = f2;
        k45Var.f22888c = f3;
        k45Var.f22889d = f4;
        k45Var.f22890e = this;
        VarHandle.storeStoreFence();
        return k45Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l45) {
            return z62.m13387o(this.f23787a, ((l45) obj).f23787a);
        }
        return false;
    }

    @Override // p000.vz4
    /* JADX INFO: renamed from: f */
    public final tz4 mo5130f() {
        throw null;
    }

    public final int hashCode() {
        return this.f23787a.hashCode();
    }

    public final String toString() {
        return "XYZColorSpace(" + this.f23787a + ')';
    }
}
