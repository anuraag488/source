package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lj1 implements ti1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ol3 f24063a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ byte f24064b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ti1 f24065c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f24066d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) {
        kj1 kj1Var;
        if (wm0Var instanceof kj1) {
            kj1Var = (kj1) wm0Var;
            int i = kj1Var.f23165v;
            if ((i & Integer.MIN_VALUE) != 0) {
                kj1Var.f23165v = i - Integer.MIN_VALUE;
            } else {
                kj1Var = new kj1(this, wm0Var);
            }
        } else {
            kj1Var = new kj1(this, wm0Var);
        }
        Object obj2 = kj1Var.f23163t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = kj1Var.f23165v;
        ju4 ju4Var = ju4.f22634a;
        if (i2 != 0) {
            if (i2 == 1) {
                k43.m7376J(obj2);
                return ju4Var;
            }
            if (i2 == 2) {
                k43.m7376J(obj2);
                return ju4Var;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj2);
        ol3 ol3Var = this.f24063a;
        int i3 = ol3Var.f26851a + 1;
        ol3Var.f26851a = i3;
        byte b = this.f24064b;
        ti1 ti1Var = this.f24065c;
        if (i3 < b) {
            kj1Var.f23165v = 1;
            return ti1Var.emit(obj, kj1Var) == ap0Var ? ap0Var : ju4Var;
        }
        Object obj3 = this.f24066d;
        kj1Var.f23165v = 2;
        C0638f5.m5545p(ti1Var, obj, obj3, kj1Var);
        return ap0Var;
    }
}
