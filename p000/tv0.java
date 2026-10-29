package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 implements q22 {

    /* JADX INFO: renamed from: a */
    public static final tv0 f31465a = new tv0();

    @Override // p000.q22
    /* JADX INFO: renamed from: a */
    public final px0 mo7265a(nv2 nv2Var) {
        sv0 sv0Var = new sv0();
        sv0Var.f30576o = nv2Var;
        VarHandle.storeStoreFence();
        return sv0Var;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p000.q22
    public final int hashCode() {
        return -1;
    }
}
