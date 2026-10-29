package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lb1 extends jn1 {

    /* JADX INFO: renamed from: b */
    public final long f23907b;

    /* JADX INFO: renamed from: c */
    public long f23908c;

    /* JADX INFO: renamed from: d */
    public boolean f23909d;

    /* JADX INFO: renamed from: e */
    public boolean f23910e;

    /* JADX INFO: renamed from: f */
    public boolean f23911f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ g90 f23912g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb1(g90 g90Var, ja4 ja4Var, long j) {
        super(ja4Var);
        this.f23912g = g90Var;
        this.f23907b = j;
        this.f23909d = true;
        if (j == 0) {
            m7892a(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final IOException m7892a(IOException iOException) {
        if (this.f23910e) {
            return iOException;
        }
        this.f23910e = true;
        if (iOException == null && this.f23909d) {
            this.f23909d = false;
        }
        return this.f23912g.m5938b(true, false, iOException);
    }

    @Override // p000.jn1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f23911f) {
            return;
        }
        this.f23911f = true;
        try {
            super.close();
            m7892a(null);
        } catch (IOException e) {
            throw m7892a(e);
        }
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: w */
    public final long mo3038w(w30 w30Var, long j) throws IOException {
        if (this.f23911f) {
            C1077qn.m9989o("closed");
            return 0L;
        }
        try {
            long jMo3038w = this.f22440a.mo3038w(w30Var, j);
            if (this.f23909d) {
                this.f23909d = false;
            }
            if (jMo3038w == -1) {
                m7892a(null);
                return -1L;
            }
            long j2 = this.f23908c + jMo3038w;
            long j3 = this.f23907b;
            if (j3 == -1 || j2 <= j3) {
                this.f23908c = j2;
                if (j2 == j3) {
                    m7892a(null);
                }
                return jMo3038w;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw m7892a(e);
        }
    }
}
