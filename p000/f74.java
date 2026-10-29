package p000;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface f74 extends Closeable, Flushable {
    /* JADX INFO: renamed from: c */
    ym4 mo3367c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* JADX INFO: renamed from: d */
    void mo3368d(w30 w30Var, long j);

    void flush();
}
