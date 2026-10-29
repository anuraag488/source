package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class jn1 implements ja4 {

    /* JADX INFO: renamed from: a */
    public final ja4 f22440a;

    public jn1(ja4 ja4Var) {
        this.f22440a = ja4Var;
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: c */
    public final ym4 mo3025c() {
        return this.f22440a.mo3025c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f22440a.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f22440a + ')';
    }
}
