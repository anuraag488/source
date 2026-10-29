package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p80 extends a04 {

    /* JADX INFO: renamed from: g */
    public final f40 f27417g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AtomicReferenceArray f27418h;

    public p80(long j, p80 p80Var, f40 f40Var, int i) {
        super(j, p80Var, i);
        this.f27417g = f40Var;
        this.f27418h = new AtomicReferenceArray(h40.f20361b * 2);
    }

    @Override // p000.a04
    /* JADX INFO: renamed from: g */
    public final int mo5g() {
        return h40.f20361b;
    }

    @Override // p000.a04
    /* JADX INFO: renamed from: h */
    public final void mo6h(int i, ro0 ro0Var) throws IllegalAccessException, InvocationTargetException {
        f40 f40Var;
        yp1 yp1Var;
        yp1 yp1Var2;
        int i2 = h40.f20361b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.f27418h.get(i * 2);
        while (true) {
            Object objM9379l = m9379l(i);
            boolean z2 = objM9379l instanceof yy4;
            f40Var = this.f27417g;
            if (z2 || (objM9379l instanceof zy4)) {
                if (m9378k(i, objM9379l, z ? h40.f20369j : h40.f20370k)) {
                    m9381n(i, null);
                    m9380m(i, !z);
                    if (!z || (yp1Var = f40Var.f18740b) == null) {
                        return;
                    }
                    y42.m12846R(yp1Var, obj, ro0Var);
                    return;
                }
            } else {
                if (objM9379l == h40.f20369j || objM9379l == h40.f20370k) {
                    break;
                }
                if (objM9379l != h40.f20366g && objM9379l != h40.f20365f) {
                    if (objM9379l == h40.f20368i || objM9379l == h40.f20363d || objM9379l == h40.f20371l) {
                        return;
                    }
                    nm0.m8798k(objM9379l, "unexpected state: ");
                    return;
                }
            }
        }
        m9381n(i, null);
        if (!z || (yp1Var2 = f40Var.f18740b) == null) {
            return;
        }
        y42.m12846R(yp1Var2, obj, ro0Var);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9378k(int i, Object obj, Object obj2) {
        return this.f27418h.compareAndSet((i * 2) + 1, obj, obj2);
    }

    /* JADX INFO: renamed from: l */
    public final Object m9379l(int i) {
        return this.f27418h.get((i * 2) + 1);
    }

    /* JADX INFO: renamed from: m */
    public final void m9380m(int i, boolean z) {
        if (z) {
            this.f27417g.m5482N((this.f22d * ((long) h40.f20361b)) + ((long) i));
        }
        m7i();
    }

    /* JADX INFO: renamed from: n */
    public final void m9381n(int i, Object obj) {
        this.f27418h.set(i * 2, obj);
    }

    /* JADX INFO: renamed from: o */
    public final void m9382o(int i, Object obj) {
        this.f27418h.set((i * 2) + 1, obj);
    }
}
