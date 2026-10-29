package p000;

/* JADX INFO: renamed from: bk */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0494bk extends AbstractC0654fk {

    /* JADX INFO: renamed from: a */
    public float f15339a;

    public C0494bk(float f) {
        this.f15339a = f;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: a */
    public final float mo3608a(int i) {
        if (i == 0) {
            return this.f15339a;
        }
        return 0.0f;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: d */
    public final void mo3609d() {
        this.f15339a = 0.0f;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: e */
    public final void mo3610e(float f, int i) {
        if (i == 0) {
            this.f15339a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0494bk) && ((C0494bk) obj).f15339a == this.f15339a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15339a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f15339a;
    }
}
