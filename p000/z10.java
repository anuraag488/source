package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z10 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35691a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f35692b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f35693c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f35694d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f35695e;

    public /* synthetic */ z10(byte b) {
        this.f35691a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fMo3575E;
        switch (this.f35691a) {
            case 0:
                b20 b20Var = (b20) this.f35693c;
                b20 b20Var2 = (b20) this.f35694d;
                b20 b20Var3 = (b20) this.f35695e;
                boolean z = this.f35692b;
                d63 d63Var = d63.f16814a;
                zq2 zq2Var = (zq2) obj;
                sq2 sq2Var = (sq2) obj2;
                kl0 kl0Var = (kl0) obj3;
                nl3 nl3Var = new nl3();
                if (b20Var != null) {
                    nl3Var.f25933a = (zq2Var.mo3575E(((p11) b20Var2.f15033a.m8328d()).f27285a) - zq2Var.mo3575E(((p11) b20Var.f15033a.m8328d()).f27285a)) + nl3Var.f25933a;
                }
                float f = 0.0f;
                if (b20Var3 == null) {
                    if (z) {
                        fMo3575E = zq2Var.mo3575E(((p11) b20Var2.f15033a.m8328d()).f27285a);
                    }
                    int iM10010E = qq2.m10010E(kl0.m7539i(kl0Var.f23210a) + nl3Var.f25933a + f);
                    db3 db3VarMo5826e = sq2Var.mo5826e(kl0.m7532b(kl0Var.f23210a, iM10010E, iM10010E, 0, 0, 12));
                    int iM7539i = kl0.m7539i(kl0Var.f23210a);
                    int i = db3VarMo5826e.f16900b;
                    C0558d0 c0558d0 = new C0558d0((byte) 19);
                    c0558d0.f16655b = db3VarMo5826e;
                    c0558d0.f16656c = nl3Var;
                    VarHandle.storeStoreFence();
                    return zq2Var.mo3583l0(iM7539i, i, w71.f33134a, c0558d0);
                }
                fMo3575E = zq2Var.mo3575E(((p11) b20Var2.f15033a.m8328d()).f27285a) - zq2Var.mo3575E(((p11) b20Var3.f15033a.m8328d()).f27285a);
                f = 0.0f + fMo3575E;
                int iM10010E2 = qq2.m10010E(kl0.m7539i(kl0Var.f23210a) + nl3Var.f25933a + f);
                db3 db3VarMo5826e2 = sq2Var.mo5826e(kl0.m7532b(kl0Var.f23210a, iM10010E2, iM10010E2, 0, 0, 12));
                int iM7539i2 = kl0.m7539i(kl0Var.f23210a);
                int i2 = db3VarMo5826e2.f16900b;
                C0558d0 c0558d1 = new C0558d0((byte) 19);
                c0558d1.f16655b = db3VarMo5826e2;
                c0558d1.f16656c = nl3Var;
                VarHandle.storeStoreFence();
                return zq2Var.mo3583l0(iM7539i2, i2, w71.f33134a, c0558d1);
            default:
                u93 u93Var = (u93) this.f35693c;
                yp1 yp1Var = (yp1) this.f35694d;
                boolean z2 = this.f35692b;
                C0950nl c0950nl = (C0950nl) this.f35695e;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                byte b = 0;
                byte b2 = 1;
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z52 z52Var = new z52(b);
                    z52Var.f35756b = u93Var;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R = vd6.m11834R(1378772662, z52Var, ir1Var);
                    z52 z52Var2 = new z52(b2);
                    z52Var2.f35756b = u93Var;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R2 = vd6.m11834R(1467919445, z52Var2, ir1Var);
                    i21 i21Var = new i21((byte) 1);
                    i21Var.f21061b = yp1Var;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R3 = vd6.m11834R(23611212, i21Var, ir1Var);
                    y52 y52Var = new y52(b2);
                    y52Var.f34911b = u93Var;
                    y52Var.f34912c = z2;
                    y52Var.f34913d = c0950nl;
                    VarHandle.storeStoreFence();
                    mz3.m8460b(null, null, false, null, pg0VarM11834R, pg0VarM11834R2, pg0VarM11834R3, vd6.m11834R(817390083, y52Var, ir1Var), ir1Var, 920125440, 63);
                } else {
                    ir1Var.m6874W();
                }
                return ju4.f22634a;
        }
    }
}
