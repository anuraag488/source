package p000;

/* JADX INFO: renamed from: ck */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0530ck extends AbstractC0654fk {

    /* JADX INFO: renamed from: a */
    public float f16071a;

    /* JADX INFO: renamed from: b */
    public float f16072b;

    public C0530ck(float f, float f2) {
        this.f16071a = f;
        this.f16072b = f2;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: a */
    public final float mo3608a(int i) {
        if (i == 0) {
            return this.f16071a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f16072b;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: b */
    public final int mo4034b() {
        return 2;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: c */
    public final AbstractC0654fk mo4035c() {
        return new C0530ck(0.0f, 0.0f);
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: d */
    public final void mo3609d() {
        this.f16071a = 0.0f;
        this.f16072b = 0.0f;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: e */
    public final void mo3610e(float f, int i) {
        if (i == 0) {
            this.f16071a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f16072b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0530ck)) {
            return false;
        }
        C0530ck c0530ck = (C0530ck) obj;
        return c0530ck.f16071a == this.f16071a && c0530ck.f16072b == this.f16072b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16072b) + (Float.hashCode(this.f16071a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f16071a + ", v2 = " + this.f16072b;
    }
}
