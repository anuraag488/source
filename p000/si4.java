package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class si4 implements InterfaceC1037pk {

    /* JADX INFO: renamed from: c */
    public static final si4 f30322c;

    /* JADX INFO: renamed from: b */
    public String f30323b;

    static {
        si4 si4Var = new si4();
        si4Var.f30323b = null;
        VarHandle.storeStoreFence();
        f30322c = si4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof si4) {
            return AbstractC1356y5.m12927u(this.f30323b, ((si4) obj).f30323b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30323b});
    }
}
