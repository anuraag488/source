package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k13 extends AbstractC1202u0 implements t82 {

    /* JADX INFO: renamed from: b */
    public static final k13 f22815b = new k13(o85.f26448h);

    @Override // p000.t82
    /* JADX INFO: renamed from: B */
    public final boolean mo4971B() {
        return false;
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: C */
    public final w01 mo4972C(yp1 yp1Var) {
        return l13.f23702a;
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: J */
    public final w01 mo4978J(boolean z, boolean z2, C0633f0 c0633f0) {
        return l13.f23702a;
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: b */
    public final boolean mo4995b() {
        return true;
    }

    @Override // p000.t82
    public final boolean isCancelled() {
        return false;
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: q */
    public final e90 mo5003q(e92 e92Var) {
        return l13.f23702a;
    }

    @Override // p000.t82
    public final boolean start() {
        return false;
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: t */
    public final Object mo5005t(wm0 wm0Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: u */
    public final CancellationException mo5006u() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p000.t82
    /* JADX INFO: renamed from: a */
    public final void mo4993a(CancellationException cancellationException) {
    }
}
