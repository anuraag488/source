package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32247a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f32248b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f32249c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f32250d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f32251e;

    public /* synthetic */ uy0(byte b) {
        this.f32247a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f32247a;
        int i = 0;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                wy0 wy0Var = (wy0) this.f32249c;
                t52 t52Var = (t52) this.f32250d;
                yv2 yv2Var = (yv2) this.f32251e;
                int i2 = this.f32248b;
                if (obj == wy0Var) {
                    C1077qn.m9989o("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof hc4) {
                    int i3 = t52Var.f30789a - i2;
                    int iM13260d = yv2Var.m13260d(obj);
                    yv2Var.m13263g(Math.min(i3, iM13260d >= 0 ? yv2Var.f35549c[iM13260d] : Integer.MAX_VALUE), obj);
                }
                return ju4Var;
            case 1:
                hx1 hx1Var = (hx1) this.f32249c;
                zq2 zq2Var = (zq2) this.f32250d;
                db3 db3Var = (db3) this.f32251e;
                int i4 = this.f32248b;
                cb3 cb3Var = (cb3) obj;
                int i5 = hx1Var.f20908b;
                hk4 hk4Var = hx1Var.f20907a;
                uo4 uo4Var = hx1Var.f20909c;
                kl4 kl4Var = (kl4) hx1Var.f20910d.invoke();
                hk4Var.m6425a(d63.f16815b, lb5.m7905N(cb3Var, i5, uo4Var, kl4Var != null ? kl4Var.f23216a : null, zq2Var.getLayoutDirection() == df2.f17012b, db3Var.f16899a), i4, db3Var.f16899a);
                cb3.m3944n(cb3Var, db3Var, Math.round(-hk4Var.f20659a.m13399h()), 0);
                return ju4Var;
            default:
                db3[] db3VarArr = (db3[]) this.f32249c;
                pr3 pr3Var = (pr3) this.f32250d;
                int i6 = this.f32248b;
                int[] iArr = (int[]) this.f32251e;
                cb3 cb3Var2 = (cb3) obj;
                int length = db3VarArr.length;
                int i7 = 0;
                while (i < length) {
                    db3 db3Var2 = db3VarArr[i];
                    db3Var2.mo4423m();
                    cb3Var2.m3952k(db3Var2, iArr[i7], pr3Var.f27919b.m7343a(db3Var2.f16900b, i6), 0.0f);
                    i++;
                    i7++;
                }
                return ju4Var;
        }
    }
}
