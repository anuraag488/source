package p000;

/* JADX INFO: renamed from: dk */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0578dk extends AbstractC0654fk {

    /* JADX INFO: renamed from: a */
    public float f17109a;

    /* JADX INFO: renamed from: b */
    public float f17110b;

    /* JADX INFO: renamed from: c */
    public float f17111c;

    public C0578dk(float f, float f2, float f3) {
        this.f17109a = f;
        this.f17110b = f2;
        this.f17111c = f3;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: a */
    public final float mo3608a(int i) {
        if (i == 0) {
            return this.f17109a;
        }
        if (i == 1) {
            return this.f17110b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f17111c;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: b */
    public final int mo4034b() {
        return 3;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: c */
    public final AbstractC0654fk mo4035c() {
        return new C0578dk(0.0f, 0.0f, 0.0f);
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: d */
    public final void mo3609d() {
        this.f17109a = 0.0f;
        this.f17110b = 0.0f;
        this.f17111c = 0.0f;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: e */
    public final void mo3610e(float f, int i) {
        if (i == 0) {
            this.f17109a = f;
        } else if (i == 1) {
            this.f17110b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f17111c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0578dk)) {
            return false;
        }
        C0578dk c0578dk = (C0578dk) obj;
        return c0578dk.f17109a == this.f17109a && c0578dk.f17110b == this.f17110b && c0578dk.f17111c == this.f17111c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17111c) + c75.m3874f(this.f17110b, Float.hashCode(this.f17109a) * 31, 31);
    }

    public final String toString() {
        float f = this.f17109a;
        float f2 = this.f17110b;
        float f3 = this.f17111c;
        StringBuilder sbM4370o = d55.m4370o("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbM4370o.append(f3);
        return sbM4370o.toString();
    }
}
