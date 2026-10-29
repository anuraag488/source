package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vy1 {

    /* JADX INFO: renamed from: a */
    public final int f32932a;

    /* JADX INFO: renamed from: b */
    public final oy1 f32933b;

    /* JADX INFO: renamed from: c */
    public long f32934c;

    /* JADX INFO: renamed from: d */
    public long f32935d;

    /* JADX INFO: renamed from: e */
    public long f32936e;

    /* JADX INFO: renamed from: f */
    public long f32937f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f32938g;

    /* JADX INFO: renamed from: h */
    public boolean f32939h;

    /* JADX INFO: renamed from: i */
    public final ty1 f32940i;

    /* JADX INFO: renamed from: j */
    public final sy1 f32941j;

    /* JADX INFO: renamed from: k */
    public final uy1 f32942k;

    /* JADX INFO: renamed from: l */
    public final uy1 f32943l;

    /* JADX INFO: renamed from: m */
    public int f32944m;

    /* JADX INFO: renamed from: n */
    public IOException f32945n;

    public vy1(int i, oy1 oy1Var, boolean z, boolean z2, uv1 uv1Var) {
        this.f32932a = i;
        this.f32933b = oy1Var;
        this.f32937f = oy1Var.f27223q.m3433a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f32938g = arrayDeque;
        long jM3433a = oy1Var.f27222p.m3433a();
        ty1 ty1Var = new ty1();
        ty1Var.f31532f = this;
        ty1Var.f31527a = jM3433a;
        ty1Var.f31528b = z2;
        ty1Var.f31529c = new w30();
        ty1Var.f31530d = new w30();
        VarHandle.storeStoreFence();
        this.f32940i = ty1Var;
        sy1 sy1Var = new sy1();
        sy1Var.f30647d = this;
        sy1Var.f30644a = z;
        sy1Var.f30645b = new w30();
        VarHandle.storeStoreFence();
        this.f32941j = sy1Var;
        this.f32942k = new uy1(this);
        this.f32943l = new uy1(this);
        if (uv1Var == null) {
            if (m12025g()) {
                return;
            }
            C1077qn.m9989o("remotely-initiated streams should have headers");
            throw null;
        }
        if (m12025g()) {
            C1077qn.m9989o("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(uv1Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    /* JADX INFO: renamed from: a */
    public final void m12019a() {
        boolean z;
        boolean zM12026h;
        byte[] bArr = zv4.f36415a;
        synchronized (this) {
            try {
                ty1 ty1Var = this.f32940i;
                if (ty1Var.f31528b || !ty1Var.f31531e) {
                    z = false;
                } else {
                    sy1 sy1Var = this.f32941j;
                    if (sy1Var.f30644a || sy1Var.f30646c) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zM12026h = m12026h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m12021c(9, null);
        } else {
            if (zM12026h) {
                return;
            }
            this.f32933b.m9330e(this.f32932a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12020b() throws IOException {
        sy1 sy1Var = this.f32941j;
        if (sy1Var.f30646c) {
            wb1.m12191j("stream closed");
            return;
        }
        if (sy1Var.f30644a) {
            wb1.m12191j("stream finished");
            return;
        }
        int i = this.f32944m;
        if (i != 0) {
            IOException iOException = this.f32945n;
            if (iOException == null) {
                throw new vc4(i);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12021c(int i, IOException iOException) {
        if (m12022d(i, iOException)) {
            this.f32933b.f27229w.m12446l(this.f32932a, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12022d(int i, IOException iOException) {
        byte[] bArr = zv4.f36415a;
        synchronized (this) {
            if (this.f32944m != 0) {
                return false;
            }
            this.f32944m = i;
            this.f32945n = iOException;
            notifyAll();
            if (this.f32940i.f31528b && this.f32941j.f30644a) {
                return false;
            }
            this.f32933b.m9330e(this.f32932a);
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12023e(int i) {
        if (m12022d(i, null)) {
            this.f32933b.m9334l(this.f32932a, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final sy1 m12024f() {
        synchronized (this) {
            if (!this.f32939h && !m12025g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f32941j;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12025g() {
        boolean z = (this.f32932a & 1) == 1;
        this.f32933b.getClass();
        return true == z;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m12026h() {
        try {
            if (this.f32944m != 0) {
                return false;
            }
            ty1 ty1Var = this.f32940i;
            if (ty1Var.f31528b || ty1Var.f31531e) {
                sy1 sy1Var = this.f32941j;
                if ((sy1Var.f30644a || sy1Var.f30646c) && this.f32939h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12027i(uv1 uv1Var, boolean z) {
        boolean zM12026h;
        byte[] bArr = zv4.f36415a;
        synchronized (this) {
            try {
                if (this.f32939h && z) {
                    this.f32940i.getClass();
                } else {
                    this.f32939h = true;
                    this.f32938g.add(uv1Var);
                }
                if (z) {
                    this.f32940i.f31528b = true;
                }
                zM12026h = m12026h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM12026h) {
            return;
        }
        this.f32933b.m9330e(this.f32932a);
    }
}
