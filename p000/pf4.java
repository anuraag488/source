package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pf4 extends st2 {

    /* JADX INFO: renamed from: a */
    public final Object f27580a;

    /* JADX INFO: renamed from: b */
    public final Object f27581b;

    /* JADX INFO: renamed from: c */
    public final PointerInputEventHandler f27582c;

    public pf4(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.f27580a = obj;
        this.f27581b = obj2;
        this.f27582c = pointerInputEventHandler;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        return new vf4(this.f27580a, this.f27581b, this.f27582c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf4)) {
            return false;
        }
        pf4 pf4Var = (pf4) obj;
        return z62.m13387o(this.f27580a, pf4Var.f27580a) && z62.m13387o(this.f27581b, pf4Var.f27581b) && this.f27582c == pf4Var.f27582c;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        vf4 vf4Var = (vf4) mt2Var;
        Object obj = vf4Var.f32569o;
        Object obj2 = this.f27580a;
        boolean z = !z62.m13387o(obj, obj2);
        vf4Var.f32569o = obj2;
        Object obj3 = vf4Var.f32570p;
        Object obj4 = this.f27581b;
        if (!z62.m13387o(obj3, obj4)) {
            z = true;
        }
        vf4Var.f32570p = obj4;
        Class<?> cls = vf4Var.f32571q.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f27582c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            vf4Var.m11891Q0();
        }
        vf4Var.f32571q = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.f27580a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f27581b;
        return this.f27582c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
