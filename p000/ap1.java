package p000;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ap1 implements df4 {

    /* JADX INFO: renamed from: a */
    public final SQLiteProgram f14767a;

    public ap1(SQLiteProgram sQLiteProgram) {
        this.f14767a = sQLiteProgram;
    }

    @Override // p000.df4
    /* JADX INFO: renamed from: E */
    public final void mo3103E(int i, byte[] bArr) {
        this.f14767a.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14767a.close();
    }

    @Override // p000.df4
    /* JADX INFO: renamed from: h */
    public final void mo3104h(int i, String str) {
        this.f14767a.bindString(i, str);
    }

    @Override // p000.df4
    /* JADX INFO: renamed from: m */
    public final void mo3105m(int i) {
        this.f14767a.bindNull(i);
    }

    @Override // p000.df4
    /* JADX INFO: renamed from: o */
    public final void mo3106o(int i, double d) {
        this.f14767a.bindDouble(i, d);
    }

    @Override // p000.df4
    /* JADX INFO: renamed from: z */
    public final void mo3107z(int i, long j) {
        this.f14767a.bindLong(i, j);
    }
}
