package p000;

/* JADX INFO: renamed from: ek */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0615ek extends AbstractC0654fk {

    /* JADX INFO: renamed from: a */
    public float f18145a;

    /* JADX INFO: renamed from: b */
    public float f18146b;

    /* JADX INFO: renamed from: c */
    public float f18147c;

    /* JADX INFO: renamed from: d */
    public float f18148d;

    public C0615ek(float f, float f2, float f3, float f4) {
        this.f18145a = f;
        this.f18146b = f2;
        this.f18147c = f3;
        this.f18148d = f4;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: a */
    public final float mo3608a(int i) {
        if (i == 0) {
            return this.f18145a;
        }
        if (i == 1) {
            return this.f18146b;
        }
        if (i == 2) {
            return this.f18147c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f18148d;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: b */
    public final int mo4034b() {
        return 4;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: c */
    public final AbstractC0654fk mo4035c() {
        return new C0615ek(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: d */
    public final void mo3609d() {
        this.f18145a = 0.0f;
        this.f18146b = 0.0f;
        this.f18147c = 0.0f;
        this.f18148d = 0.0f;
    }

    @Override // p000.AbstractC0654fk
    /* JADX INFO: renamed from: e */
    public final void mo3610e(float f, int i) {
        if (i == 0) {
            this.f18145a = f;
            return;
        }
        if (i == 1) {
            this.f18146b = f;
        } else if (i == 2) {
            this.f18147c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f18148d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0615ek)) {
            return false;
        }
        C0615ek c0615ek = (C0615ek) obj;
        return c0615ek.f18145a == this.f18145a && c0615ek.f18146b == this.f18146b && c0615ek.f18147c == this.f18147c && c0615ek.f18148d == this.f18148d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18148d) + c75.m3874f(this.f18147c, c75.m3874f(this.f18146b, Float.hashCode(this.f18145a) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.f18145a;
        float f2 = this.f18146b;
        float f3 = this.f18147c;
        float f4 = this.f18148d;
        StringBuilder sbM4370o = d55.m4370o("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbM4370o.append(f3);
        sbM4370o.append(", v4 = ");
        sbM4370o.append(f4);
        return sbM4370o.toString();
    }
}
