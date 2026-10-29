package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kb1 extends in1 {

    /* JADX INFO: renamed from: b */
    public final long f23036b;

    /* JADX INFO: renamed from: c */
    public boolean f23037c;

    /* JADX INFO: renamed from: d */
    public long f23038d;

    /* JADX INFO: renamed from: e */
    public boolean f23039e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ g90 f23040f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb1(g90 g90Var, f74 f74Var, long j) {
        super(f74Var);
        this.f23040f = g90Var;
        this.f23036b = j;
    }

    /* JADX INFO: renamed from: a */
    public final IOException m7468a(IOException iOException) {
        if (this.f23037c) {
            return iOException;
        }
        this.f23037c = true;
        return this.f23040f.m5938b(false, true, iOException);
    }

    @Override // p000.in1, p000.f74, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f23039e) {
            return;
        }
        this.f23039e = true;
        long j = this.f23036b;
        if (j != -1 && this.f23038d != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            m7468a(null);
        } catch (IOException e) {
            throw m7468a(e);
        }
    }

    @Override // p000.in1, p000.f74
    /* JADX INFO: renamed from: d */
    public final void mo3368d(w30 w30Var, long j) throws IOException {
        if (this.f23039e) {
            C1077qn.m9989o("closed");
            return;
        }
        long j2 = this.f23036b;
        if (j2 == -1 || this.f23038d + j <= j2) {
            try {
                super.mo3368d(w30Var, j);
                this.f23038d += j;
                return;
            } catch (IOException e) {
                throw m7468a(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.f23038d + j));
    }

    @Override // p000.in1, p000.f74, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            throw m7468a(e);
        }
    }
}
