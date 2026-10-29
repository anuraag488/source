package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tn3 implements jk2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ek2 f31262a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ql3 f31263b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ zo0 f31264c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ek2 f31265d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ b70 f31266e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ gx2 f31267f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ ut4 f31268g;

    @Override // p000.jk2
    /* JADX INFO: renamed from: b */
    public final void mo3449b(lk2 lk2Var, ek2 ek2Var) {
        ql3 ql3Var = this.f31263b;
        if (ek2Var == this.f31262a) {
            ql3Var.f28555a = lb5.m7910S(this.f31264c, null, null, new C1312wz(this.f31267f, this.f31268g, (wm0) null), 3);
            return;
        }
        if (ek2Var == this.f31265d) {
            t82 t82Var = (t82) ql3Var.f28555a;
            if (t82Var != null) {
                t82Var.mo4993a(null);
            }
            ql3Var.f28555a = null;
        }
        if (ek2Var == ek2.ON_DESTROY) {
            this.f31266e.resumeWith(ju4.f22634a);
        }
    }
}
