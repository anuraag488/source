package p000;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n93 {

    /* JADX INFO: renamed from: a */
    public zi0 f25567a;

    /* JADX INFO: renamed from: b */
    public ui0 f25568b;

    /* JADX INFO: renamed from: c */
    public ir1 f25569c;

    /* JADX INFO: renamed from: d */
    public mq1 f25570d;

    /* JADX INFO: renamed from: e */
    public boolean f25571e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0618en f25572f;

    /* JADX INFO: renamed from: g */
    public Object f25573g;

    /* JADX INFO: renamed from: h */
    public AtomicReference f25574h;

    /* JADX INFO: renamed from: i */
    public long f25575i;

    /* JADX INFO: renamed from: j */
    public mw2 f25576j;

    /* JADX INFO: renamed from: k */
    public om3 f25577k;

    /* JADX INFO: renamed from: l */
    public tt2 f25578l;

    /* JADX INFO: renamed from: a */
    public final void m8631a() throws Exception {
        AtomicReference atomicReference = this.f25574h;
        try {
            switch (((p93) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    m8632b();
                    p93 p93Var = p93.f27473f;
                    p93 p93Var2 = p93.f27474g;
                    if (atomicReference.compareAndSet(p93Var, p93Var2)) {
                        return;
                    }
                    kd3.m7503b("Unexpected state change from: " + p93Var + " to: " + p93Var2 + ".");
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new gf0();
            }
        } catch (Exception e) {
            atomicReference.set(p93.f27468a);
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8632b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f25573g) {
                try {
                    this.f25578l.m11156x(this.f25572f, this.f25577k);
                    this.f25577k.m9186c();
                    this.f25577k.m9187d();
                    this.f25577k.m9185b();
                    this.f25567a.f36127q = null;
                } catch (Throwable th) {
                    this.f25577k.m9185b();
                    this.f25567a.f36127q = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8633c() {
        return ((p93) this.f25574h.get()).compareTo(p93.f27473f) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m8634d() {
        p93 p93Var = p93.f27471d;
        p93 p93Var2 = p93.f27473f;
        if (this.f25574h.compareAndSet(p93Var, p93Var2)) {
            return;
        }
        kd3.m7503b("Unexpected state change from: " + p93Var + " to: " + p93Var2 + ".");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8635e(o64 o64Var) throws Exception {
        ir1 ir1Var = this.f25569c;
        boolean z = this.f25571e;
        zi0 zi0Var = this.f25567a;
        ui0 ui0Var = this.f25568b;
        AtomicReference atomicReference = this.f25574h;
        try {
            switch (((p93) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    if (z) {
                        ir1Var.f21710z = 0;
                        ir1Var.f21709y = true;
                    }
                    this.f25576j = ui0Var.mo5180b(zi0Var, o64Var, this.f25570d);
                    if (z) {
                        if (ir1Var.f21669F || ir1Var.f21710z != 0) {
                            kd3.m7502a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        ir1Var.f21710z = -1;
                        ir1Var.f21709y = false;
                    }
                    p93 p93Var = p93.f27470c;
                    p93 p93Var2 = p93.f27471d;
                    if (!atomicReference.compareAndSet(p93Var, p93Var2)) {
                        kd3.m7503b("Unexpected state change from: " + p93Var + " to: " + p93Var2 + ".");
                    }
                    if (this.f25576j.m8415g()) {
                        m8634d();
                    }
                    return m8633c();
                case 3:
                    p93 p93Var3 = p93.f27471d;
                    p93 p93Var4 = p93.f27472e;
                    if (!atomicReference.compareAndSet(p93Var3, p93Var4)) {
                        kd3.m7503b("Unexpected state change from: " + p93Var3 + " to: " + p93Var4 + ".");
                    }
                    long j = this.f25575i;
                    try {
                        this.f25575i = oh6.m9110p();
                        this.f25576j = ui0Var.mo5187q(zi0Var, o64Var, this.f25576j);
                        this.f25575i = j;
                        if (!atomicReference.compareAndSet(p93Var4, p93Var3)) {
                            kd3.m7503b("Unexpected state change from: " + p93Var4 + " to: " + p93Var3 + ".");
                        }
                        if (this.f25576j.m8415g()) {
                            m8634d();
                        }
                        return m8633c();
                    } catch (Throwable th) {
                        this.f25575i = j;
                        p93 p93Var5 = p93.f27472e;
                        p93 p93Var6 = p93.f27471d;
                        if (!atomicReference.compareAndSet(p93Var5, p93Var6)) {
                            kd3.m7503b("Unexpected state change from: " + p93Var5 + " to: " + p93Var6 + ".");
                        }
                        throw th;
                    }
                case 4:
                    qi0.m9890b("Recursive call to resume()");
                    throw new gf0();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new gf0();
            }
        } catch (Exception e) {
            atomicReference.set(p93.f27468a);
            throw e;
        }
    }
}
