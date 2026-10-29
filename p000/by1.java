package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class by1 extends zx1 {

    /* JADX INFO: renamed from: d */
    public final dz1 f15678d;

    /* JADX INFO: renamed from: e */
    public long f15679e;

    /* JADX INFO: renamed from: f */
    public boolean f15680f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ fy1 f15681g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by1(fy1 fy1Var, dz1 dz1Var) {
        super(fy1Var);
        this.f15681g = fy1Var;
        this.f15678d = dz1Var;
        this.f15679e = -1L;
        this.f15680f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM13824s;
        if (this.f36441b) {
            return;
        }
        if (this.f15680f) {
            try {
                zM13824s = zv4.m13824s(this, 100);
            } catch (IOException unused) {
                zM13824s = false;
            }
            if (!zM13824s) {
                this.f15681g.f19410b.m6423c0();
                m13833a();
            }
        }
        this.f36441b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r11.f15680f == false) goto L27;
     */
    @Override // p000.zx1, p000.ja4
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo3038w(w30 w30Var, long j) throws IOException {
        fy1 fy1Var = this.f15681g;
        k40 k40Var = fy1Var.f19411c;
        if (j < 0) {
            C1077qn.m9988n(zi4.m13619s("byteCount < 0: ", j));
            return 0L;
        }
        if (this.f36441b) {
            C1077qn.m9989o("closed");
            return 0L;
        }
        if (this.f15680f) {
            long j2 = this.f15679e;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    k40Var.mo3032n();
                }
                try {
                    this.f15679e = k40Var.mo3021H();
                    String string = hd4.m6360z0(k40Var.mo3032n()).toString();
                    if (this.f15679e < 0 || (string.length() > 0 && !od4.m9043X(string, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f15679e + string + '\"');
                    }
                    if (this.f15679e == 0) {
                        this.f15680f = false;
                        xy1.m12775b(fy1Var.f19409a.f20321j, this.f15678d, fy1Var.f19414f.m11992c());
                        m13833a();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jMo3038w = super.mo3038w(w30Var, Math.min(j, this.f15679e));
            if (jMo3038w != -1) {
                this.f15679e -= jMo3038w;
                return jMo3038w;
            }
            fy1Var.f19410b.m6423c0();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m13833a();
            throw protocolException;
        }
        return -1L;
    }
}
