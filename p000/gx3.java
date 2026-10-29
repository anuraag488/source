package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gx3 implements ti1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ti1 f20173a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f20174b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) {
        fx3 fx3Var;
        if (wm0Var instanceof fx3) {
            fx3Var = (fx3) wm0Var;
            int i = fx3Var.f19378u;
            if ((i & Integer.MIN_VALUE) != 0) {
                fx3Var.f19378u = i - Integer.MIN_VALUE;
            } else {
                fx3Var = new fx3(this, wm0Var);
            }
        } else {
            fx3Var = new fx3(this, wm0Var);
        }
        Object obj2 = fx3Var.f19377t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = fx3Var.f19378u;
        if (i2 == 0) {
            k43.m7376J(obj2);
            ti1 ti1Var = this.f20173a;
            if (i41.m6645d(((ux3) obj).f32234b, this.f20174b) > 0) {
                fx3Var.f19378u = 1;
                if (ti1Var.emit(obj, fx3Var) == ap0Var) {
                    return ap0Var;
                }
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj2);
        }
        return ju4.f22634a;
    }
}
