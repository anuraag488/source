package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zo1 implements ze4 {

    /* JADX INFO: renamed from: a */
    public Context f36213a;

    /* JADX INFO: renamed from: b */
    public String f36214b;

    /* JADX INFO: renamed from: c */
    public hf0 f36215c;

    /* JADX INFO: renamed from: d */
    public boolean f36216d;

    /* JADX INFO: renamed from: e */
    public boolean f36217e;

    /* JADX INFO: renamed from: f */
    public dg4 f36218f;

    /* JADX INFO: renamed from: g */
    public boolean f36219g;

    @Override // p000.ze4
    /* JADX INFO: renamed from: G */
    public final uo1 mo13542G() {
        return ((yo1) this.f36218f.getValue()).m13194a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dg4 dg4Var = this.f36218f;
        if (dg4Var.m4507a()) {
            ((yo1) dg4Var.getValue()).close();
        }
    }

    @Override // p000.ze4
    public final String getDatabaseName() {
        return this.f36214b;
    }

    @Override // p000.ze4
    public final void setWriteAheadLoggingEnabled(boolean z) {
        dg4 dg4Var = this.f36218f;
        if (dg4Var.m4507a()) {
            ((yo1) dg4Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.f36219g = z;
    }
}
