package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y64 extends mt2 implements lf2, g14 {

    /* JADX INFO: renamed from: A */
    public ye2 f34950A;

    /* JADX INFO: renamed from: B */
    public o04 f34951B;

    /* JADX INFO: renamed from: o */
    public float f34952o;

    /* JADX INFO: renamed from: p */
    public float f34953p;

    /* JADX INFO: renamed from: q */
    public float f34954q;

    /* JADX INFO: renamed from: r */
    public float f34955r;

    /* JADX INFO: renamed from: s */
    public float f34956s;

    /* JADX INFO: renamed from: t */
    public float f34957t;

    /* JADX INFO: renamed from: u */
    public long f34958u;

    /* JADX INFO: renamed from: v */
    public p44 f34959v;

    /* JADX INFO: renamed from: w */
    public boolean f34960w;

    /* JADX INFO: renamed from: x */
    public long f34961x;

    /* JADX INFO: renamed from: y */
    public long f34962y;

    /* JADX INFO: renamed from: z */
    public byte f34963z;

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        cz3 cz3Var = new cz3((byte) 3);
        cz3Var.f16638b = db3VarMo5826e;
        cz3Var.f16639c = this;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, cz3Var);
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        if (this.f34960w) {
            o14.m8924e(q14Var, this.f34959v);
        }
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: k */
    public final boolean mo5442k() {
        return false;
    }

    public final String toString() {
        float f = this.f34952o;
        float f2 = this.f34953p;
        float f3 = this.f34954q;
        float f4 = this.f34955r;
        float f5 = this.f34956s;
        float f6 = this.f34957t;
        String strM11082c = to4.m11082c(this.f34958u);
        p44 p44Var = this.f34959v;
        boolean z = this.f34960w;
        String strM9470i = pb0.m9470i(this.f34961x);
        String strM9470i2 = pb0.m9470i(this.f34962y);
        String strM10015J = qq2.m10015J(this.f34963z);
        ye2 ye2Var = this.f34950A;
        StringBuilder sbM4370o = d55.m4370o("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
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
        zi4.m13599B(sbM4370o, strM9470i2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", strM10015J, ", colorFilter=nulloutsets=");
        sbM4370o.append(ye2Var);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
