package p000;

/* JADX INFO: renamed from: mn */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0915mn {

    /* JADX INFO: renamed from: a */
    public float f25040a;

    /* JADX INFO: renamed from: b */
    public float f25041b;

    /* JADX INFO: renamed from: c */
    public float f25042c;

    /* JADX INFO: renamed from: d */
    public float f25043d;

    /* JADX INFO: renamed from: e */
    public float f25044e;

    /* JADX INFO: renamed from: f */
    public float f25045f;

    /* JADX INFO: renamed from: g */
    public float f25046g;

    /* JADX INFO: renamed from: h */
    public float f25047h;

    /* JADX INFO: renamed from: i */
    public float f25048i;

    /* JADX INFO: renamed from: j */
    public float[] f25049j;

    /* JADX INFO: renamed from: k */
    public float f25050k;

    /* JADX INFO: renamed from: l */
    public float f25051l;

    /* JADX INFO: renamed from: m */
    public float f25052m;

    /* JADX INFO: renamed from: n */
    public float f25053n;

    /* JADX INFO: renamed from: o */
    public float f25054o;

    /* JADX INFO: renamed from: p */
    public boolean f25055p;

    /* JADX INFO: renamed from: q */
    public float f25056q;

    /* JADX INFO: renamed from: r */
    public float f25057r;

    /* JADX INFO: renamed from: a */
    public final float m8360a() {
        float f = this.f25053n * this.f25048i;
        return f * this.f25052m * (this.f25051l / ((float) Math.hypot(f, (-this.f25054o) * this.f25047h)));
    }

    /* JADX INFO: renamed from: b */
    public final float m8361b() {
        float f = this.f25053n * this.f25048i;
        float f2 = (-this.f25054o) * this.f25047h;
        return f2 * this.f25052m * (this.f25051l / ((float) Math.hypot(f, f2)));
    }

    /* JADX INFO: renamed from: c */
    public final void m8362c(float f) {
        float f2 = (this.f25052m == -1.0f ? this.f25041b - f : f - this.f25040a) * this.f25050k;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                float f4 = f2 * 100.0f;
                int i = (int) f4;
                float[] fArr = this.f25049j;
                float f5 = fArr[i];
                f3 = ((fArr[i + 1] - f5) * (f4 - i)) + f5;
            }
        }
        double d = f3 * 1.5707964f;
        this.f25047h = (float) Math.sin(d);
        this.f25048i = (float) Math.cos(d);
    }
}
