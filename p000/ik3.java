package p000;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ik3 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final b01 f21518a;

    public ik3(b01 b01Var) {
        this.f21518a = b01Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21518a.close();
    }
}
