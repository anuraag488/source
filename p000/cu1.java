package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class cu1 extends st2 {

    /* JADX INFO: renamed from: a */
    public float f16482a;

    /* JADX INFO: renamed from: b */
    public float f16483b;

    /* JADX INFO: renamed from: c */
    public float f16484c;

    /* JADX INFO: renamed from: d */
    public float f16485d;

    /* JADX INFO: renamed from: e */
    public float f16486e;

    /* JADX INFO: renamed from: f */
    public float f16487f;

    /* JADX INFO: renamed from: g */
    public long f16488g;

    /* JADX INFO: renamed from: h */
    public p44 f16489h;

    /* JADX INFO: renamed from: i */
    public boolean f16490i;

    /* JADX INFO: renamed from: j */
    public long f16491j;

    /* JADX INFO: renamed from: k */
    public long f16492k;

    /* JADX INFO: renamed from: l */
    public byte f16493l;

    /* JADX INFO: renamed from: m */
    public ye2 f16494m;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        float f = this.f16482a;
        float f2 = this.f16483b;
        float f3 = this.f16484c;
        float f4 = this.f16485d;
        float f5 = this.f16486e;
        float f6 = this.f16487f;
        long j = this.f16488g;
        p44 p44Var = this.f16489h;
        boolean z = this.f16490i;
        long j2 = this.f16491j;
        long j3 = this.f16492k;
        byte b = this.f16493l;
        ye2 ye2Var = this.f16494m;
        y64 y64Var = new y64();
        y64Var.f34952o = f;
        y64Var.f34953p = f2;
        y64Var.f34954q = f3;
        y64Var.f34955r = f4;
        y64Var.f34956s = f5;
        y64Var.f34957t = f6;
        y64Var.f34958u = j;
        y64Var.f34959v = p44Var;
        y64Var.f34960w = z;
        y64Var.f34961x = j2;
        y64Var.f34962y = j3;
        y64Var.f34963z = b;
        y64Var.f34950A = ye2Var;
        o04 o04Var = new o04((byte) 4);
        o04Var.f26271b = y64Var;
        VarHandle.storeStoreFence();
        y64Var.f34951B = o04Var;
        return y64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu1)) {
            return false;
        }
        cu1 cu1Var = (cu1) obj;
        if (Float.compare(this.f16482a, cu1Var.f16482a) != 0 || Float.compare(this.f16483b, cu1Var.f16483b) != 0 || Float.compare(this.f16484c, cu1Var.f16484c) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.f16485d, cu1Var.f16485d) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.f16486e, cu1Var.f16486e) != 0 || Float.compare(this.f16487f, cu1Var.f16487f) != 0 || !to4.m11081b(this.f16488g, cu1Var.f16488g) || !z62.m13387o(this.f16489h, cu1Var.f16489h) || this.f16490i != cu1Var.f16490i) {
            return false;
        }
        long j = this.f16491j;
        long j2 = cu1Var.f16491j;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && ws4.m12408a(this.f16492k, cu1Var.f16492k) && this.f16493l == cu1Var.f16493l && z62.m13387o(this.f16494m, cu1Var.f16494m);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        e13 e13Var;
        y64 y64Var = (y64) mt2Var;
        y64Var.f34952o = this.f16482a;
        y64Var.f34953p = this.f16483b;
        y64Var.f34954q = this.f16484c;
        y64Var.f34955r = this.f16485d;
        y64Var.f34956s = this.f16486e;
        y64Var.f34957t = this.f16487f;
        y64Var.f34958u = this.f16488g;
        y64Var.f34959v = this.f16489h;
        y64Var.f34960w = this.f16490i;
        y64Var.f34961x = this.f16491j;
        y64Var.f34962y = this.f16492k;
        y64Var.f34963z = this.f16493l;
        y64Var.f34950A = this.f16494m;
        o04 o04Var = y64Var.f34951B;
        if (y64Var.f25195a.f25208n && (e13Var = sc6.m10650V(y64Var, 2).f17628x) != null) {
            e13Var.m4897z1(o04Var, true);
        }
    }

    public final int hashCode() {
        int iM3874f = c75.m3874f(this.f16487f, c75.m3874f(this.f16486e, c75.m3874f(0.0f, c75.m3874f(0.0f, c75.m3874f(this.f16485d, c75.m3874f(0.0f, c75.m3874f(0.0f, c75.m3874f(this.f16484c, c75.m3874f(this.f16483b, Float.hashCode(this.f16482a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        long j = this.f16488g;
        int i = to4.f31293c;
        int iM13611k = zi4.m13611k((this.f16489h.hashCode() + zi4.m13612l(iM3874f, j, 31)) * 31, 961, this.f16490i);
        long j2 = this.f16491j;
        int i2 = pb0.f27502i;
        return this.f16494m.hashCode() + zi4.m13609i(this.f16493l, zi4.m13609i(0, zi4.m13612l(zi4.m13612l(iM13611k, j2, 31), this.f16492k, 31), 31), 961);
    }

    public final String toString() {
        float f = this.f16482a;
        float f2 = this.f16483b;
        float f3 = this.f16484c;
        float f4 = this.f16485d;
        float f5 = this.f16486e;
        float f6 = this.f16487f;
        String strM11082c = to4.m11082c(this.f16488g);
        p44 p44Var = this.f16489h;
        boolean z = this.f16490i;
        String strM9470i = pb0.m9470i(this.f16491j);
        String strM9470i2 = pb0.m9470i(this.f16492k);
        String strM10015J = qq2.m10015J(this.f16493l);
        ye2 ye2Var = this.f16494m;
        StringBuilder sbM4370o = d55.m4370o("GraphicsLayerElement(scaleX=", f, ", scaleY=", f2, ", alpha=");
        sbM4370o.append(f3);
        sbM4370o.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sbM4370o.append(f4);
        sbM4370o.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sbM4370o.append(f5);
        sbM4370o.append(", cameraDistance=");
        sbM4370o.append(f6);
        sbM4370o.append(", transformOrigin=");
        sbM4370o.append(strM11082c);
        sbM4370o.append(", shape=");
        sbM4370o.append(p44Var);
        sbM4370o.append(", clip=");
        sbM4370o.append(z);
        sbM4370o.append(", renderEffect=null, ambientShadowColor=");
        sbM4370o.append(strM9470i);
        sbM4370o.append(", spotShadowColor=");
        zi4.m13599B(sbM4370o, strM9470i2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", strM10015J, ", colorFilter=null, outsets=");
        sbM4370o.append(ye2Var);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
