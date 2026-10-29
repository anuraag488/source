package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class v82 extends e92 {

    /* JADX INFO: renamed from: d */
    public final boolean f32461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v82(t82 t82Var) {
        super(true);
        boolean z = true;
        m4986R(t82Var);
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long j = e92.f17907a;
        e90 e90Var = (e90) unsafe.getObjectVolatile(this, j);
        f90 f90Var = e90Var instanceof f90 ? (f90) e90Var : null;
        if (f90Var == null) {
            z = false;
            break;
        }
        e92 e92VarM12167m = f90Var.m12167m();
        while (!e92VarM12167m.mo4980L()) {
            e90 e90Var2 = (e90) AbstractC1078qo.f28633a.getObjectVolatile(e92VarM12167m, j);
            f90 f90Var2 = e90Var2 instanceof f90 ? (f90) e90Var2 : null;
            if (f90Var2 == null) {
                z = false;
                break;
            }
            e92VarM12167m = f90Var2.m12167m();
        }
        this.f32461d = z;
    }

    @Override // p000.e92
    /* JADX INFO: renamed from: L */
    public final boolean mo4980L() {
        return this.f32461d;
    }

    @Override // p000.e92
    /* JADX INFO: renamed from: M */
    public final boolean mo4981M() {
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m11767h0() {
        m4989U(ju4.f22634a);
    }
}
