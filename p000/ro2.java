package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ro2 implements ky0 {

    /* JADX INFO: renamed from: a */
    public boolean f29473a;

    /* JADX INFO: renamed from: b */
    public long f29474b = 9223372034707292159L;

    /* JADX INFO: renamed from: c */
    public long f29475c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ so2 f29476d;

    public ro2(so2 so2Var) {
        this.f29476d = so2Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m10383a(gx1 gx1Var, float f) {
        so2 so2Var = this.f29476d;
        x72 x72Var = so2Var.f30443q;
        if (x72Var == null) {
            x72Var = new x72((byte) 2);
            so2Var.f30443q = x72Var;
        }
        int iM9210e0 = AbstractC0990oo.m9210e0(gx1Var, (gx1[]) x72Var.f34037b);
        if (iM9210e0 >= 0) {
            float[] fArr = (float[]) x72Var.f34038c;
            if (fArr[iM9210e0] != f) {
                fArr[iM9210e0] = f;
                ((byte[]) x72Var.f34039d)[iM9210e0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) x72Var.f34039d;
                if (bArr[iM9210e0] == 2) {
                    bArr[iM9210e0] = 0;
                    return;
                }
                return;
            }
        }
        int i = x72Var.f34036a;
        gx1[] gx1VarArr = (gx1[]) x72Var.f34037b;
        if (i == gx1VarArr.length) {
            int i2 = i * 2;
            x72Var.f34037b = (gx1[]) Arrays.copyOf(gx1VarArr, i2);
            x72Var.f34038c = Arrays.copyOf((float[]) x72Var.f34038c, i2);
            x72Var.f34039d = Arrays.copyOf((byte[]) x72Var.f34039d, i2);
        }
        ((gx1[]) x72Var.f34037b)[i] = gx1Var;
        ((byte[]) x72Var.f34039d)[i] = 3;
        ((float[]) x72Var.f34038c)[i] = f;
        x72Var.f34036a++;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f29476d.mo3580c();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f29476d.mo3585r();
    }
}
