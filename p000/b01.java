package p000;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b01 implements Closeable {

    /* JADX INFO: renamed from: a */
    public a01 f14977a;

    /* JADX INFO: renamed from: b */
    public boolean f14978b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ d01 f14979c;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f14978b) {
            return;
        }
        this.f14978b = true;
        d01 d01Var = this.f14979c;
        synchronized (d01Var) {
            a01 a01Var = this.f14977a;
            int i = a01Var.f16h - 1;
            a01Var.f16h = i;
            if (i == 0 && a01Var.f14f) {
                cm3 cm3Var = d01.f16663q;
                d01Var.m4255u(a01Var);
            }
        }
    }
}
