package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ut3 implements wm0, bp0 {

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f32157b = AtomicReferenceFieldUpdater.newUpdater(ut3.class, Object.class, "result");

    /* JADX INFO: renamed from: a */
    public final wm0 f32158a;
    private volatile Object result;

    public ut3(wm0 wm0Var) {
        ap0 ap0Var = ap0.f14763a;
        this.f32158a = wm0Var;
        this.result = ap0Var;
    }

    @Override // p000.bp0
    public final bp0 getCallerFrame() {
        wm0 wm0Var = this.f32158a;
        if (wm0Var instanceof bp0) {
            return (bp0) wm0Var;
        }
        return null;
    }

    @Override // p000.wm0
    public final ro0 getContext() {
        return this.f32158a.getContext();
    }

    @Override // p000.wm0
    public final void resumeWith(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32157b;
        while (true) {
            Object obj2 = this.result;
            ap0 ap0Var = ap0.f14764b;
            if (obj2 != ap0Var) {
                ap0 ap0Var2 = ap0.f14763a;
                if (obj2 != ap0Var2) {
                    C1077qn.m9989o("Already resumed");
                    return;
                } else if (atomicReferenceFieldUpdater.compareAndSet(this, ap0Var2, ap0.f14765c)) {
                    this.f32158a.resumeWith(obj);
                    return;
                }
            } else if (atomicReferenceFieldUpdater.compareAndSet(this, ap0Var, obj)) {
                return;
            }
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f32158a;
    }
}
