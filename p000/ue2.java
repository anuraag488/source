package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ue2 implements wq1, Serializable {
    private final byte arity;

    /* JADX WARN: Multi-variable type inference failed */
    public ue2(int i) {
        this.arity = i;
    }

    @Override // p000.wq1
    public final int getArity() {
        return this.arity;
    }

    public final String toString() {
        rl3.f29396a.getClass();
        return sl3.m10870a(this);
    }
}
