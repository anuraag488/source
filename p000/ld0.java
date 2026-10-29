package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ld0 implements ti1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ f40 f23958a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f23959b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (p000.zt5.m13768N(r0) == r1) goto L21;
     */
    @Override // p000.ti1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, wm0 wm0Var) {
        kd0 kd0Var;
        if (wm0Var instanceof kd0) {
            kd0Var = (kd0) wm0Var;
            int i = kd0Var.f23073v;
            if ((i & Integer.MIN_VALUE) != 0) {
                kd0Var.f23073v = i - Integer.MIN_VALUE;
            } else {
                kd0Var = new kd0(this, wm0Var);
            }
        } else {
            kd0Var = new kd0(this, wm0Var);
        }
        Object obj2 = kd0Var.f23071t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = kd0Var.f23073v;
        if (i2 == 0) {
            k43.m7376J(obj2);
            f40 f40Var = this.f23958a;
            m22 m22Var = new m22(this.f23959b, obj);
            kd0Var.f23073v = 1;
            if (f40Var.mo5484c(kd0Var, m22Var) != ap0Var) {
            }
            return ap0Var;
        }
        if (i2 == 1) {
            k43.m7376J(obj2);
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj2);
        }
        return ju4.f22634a;
        kd0Var.f23073v = 2;
    }
}
