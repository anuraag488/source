package p000;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bd1 extends in1 {

    /* JADX INFO: renamed from: b */
    public C1127s f15214b;

    /* JADX INFO: renamed from: c */
    public boolean f15215c;

    @Override // p000.in1, p000.f74, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f15215c = true;
            this.f15214b.invoke(e);
        }
    }

    @Override // p000.in1, p000.f74
    /* JADX INFO: renamed from: d */
    public final void mo3368d(w30 w30Var, long j) throws EOFException {
        if (this.f15215c) {
            w30Var.m12048D(j);
            return;
        }
        try {
            super.mo3368d(w30Var, j);
        } catch (IOException e) {
            this.f15215c = true;
            this.f15214b.invoke(e);
        }
    }

    @Override // p000.in1, p000.f74, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.f15215c = true;
            this.f15214b.invoke(e);
        }
    }
}
