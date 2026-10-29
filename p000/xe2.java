package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xe2 implements pm3, to0 {

    /* JADX INFO: renamed from: a */
    public final ro0 f34198a;

    /* JADX INFO: renamed from: b */
    public final mq1 f34199b;

    /* JADX INFO: renamed from: c */
    public final um0 f34200c;

    /* JADX INFO: renamed from: d */
    public t82 f34201d;

    public xe2(ro0 ro0Var, mq1 mq1Var) {
        this.f34198a = ro0Var;
        this.f34199b = mq1Var;
        this.f34200c = zp0.m13670b(ro0Var.plus(this));
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: c */
    public final void mo37c() {
        t82 t82Var = this.f34201d;
        if (t82Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            t82Var.mo4993a(cancellationException);
        }
        this.f34201d = lb5.m7910S(this.f34200c, null, null, this.f34199b, 3);
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: d */
    public final void mo38d() {
        t82 t82Var = this.f34201d;
        if (t82Var != null) {
            t82Var.mo4993a(new fn1((byte) 1));
        }
        this.f34201d = null;
    }

    @Override // p000.ro0
    public final Object fold(mq1 mq1Var, Object obj) {
        return mq1Var.invoke(obj, this);
    }

    @Override // p000.ro0
    public final po0 get(qo0 qo0Var) {
        return AbstractC1356y5.m12929w(this, qo0Var);
    }

    @Override // p000.po0
    public final qo0 getKey() {
        return wv1.f33762e;
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: h */
    public final void mo41h() {
        t82 t82Var = this.f34201d;
        if (t82Var != null) {
            t82Var.mo4993a(new fn1((byte) 1));
        }
        this.f34201d = null;
    }

    @Override // p000.to0
    public final void handleException(ro0 ro0Var, Throwable th) throws Throwable {
        xi0 xi0Var = (xi0) ro0Var.get(xi0.f34298b);
        if (xi0Var != null) {
            xi0Var.m12697c(this, th);
        }
        to0 to0Var = (to0) this.f34198a.get(wv1.f33762e);
        if (to0Var == null) {
            throw th;
        }
        to0Var.handleException(ro0Var, th);
    }

    @Override // p000.ro0
    public final ro0 minusKey(qo0 qo0Var) {
        return AbstractC1356y5.m12896E(this, qo0Var);
    }

    @Override // p000.ro0
    public final ro0 plus(ro0 ro0Var) {
        return qs5.m10089N(this, ro0Var);
    }
}
