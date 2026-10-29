package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qz3 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28902a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yz3 f28903b;

    public /* synthetic */ qz3(byte b) {
        this.f28902a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f28902a;
        ju4 ju4Var = ju4.f22634a;
        yz3 yz3Var = this.f28903b;
        long jLongValue = ((Long) obj).longValue();
        switch (b) {
            case 0:
                yz3Var.f35662q = jLongValue;
                break;
            default:
                long j = jLongValue - yz3Var.f35662q;
                yz3Var.f35662q = jLongValue;
                long jM10011F = qq2.m10011F(j / ((double) yz3Var.f35649O));
                cw2 cw2Var = yz3Var.f35646L;
                if (cw2Var.m4209j()) {
                    Object[] objArr = cw2Var.f16532a;
                    int i = cw2Var.f16533b;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        rz3 rz3Var = (rz3) objArr[i3];
                        yz3.m13272y(rz3Var, jM10011F);
                        rz3Var.f29749c = true;
                    }
                    dp4 dp4Var = yz3Var.f35654i;
                    if (dp4Var != null) {
                        dp4Var.m4657s();
                    }
                    int i4 = cw2Var.f16533b;
                    Object[] objArr2 = cw2Var.f16532a;
                    r52 r52VarM10660c0 = sc6.m10660c0(0, i4);
                    int i5 = r52VarM10660c0.f27382a;
                    int i6 = r52VarM10660c0.f27383b;
                    if (i5 <= i6) {
                        while (true) {
                            objArr2[i5 - i2] = objArr2[i5];
                            if (((rz3) objArr2[i5]).f29749c) {
                                i2++;
                            }
                            if (i5 != i6) {
                                i5++;
                            }
                        }
                    }
                    Arrays.fill(objArr2, i4 - i2, i4, (Object) null);
                    cw2Var.f16533b -= i2;
                }
                rz3 rz3Var2 = yz3Var.f35647M;
                if (rz3Var2 != null) {
                    rz3Var2.f29753g = yz3Var.f35655j;
                    yz3.m13272y(rz3Var2, jM10011F);
                    yz3Var.m13275C(rz3Var2.f29750d);
                    if (rz3Var2.f29750d == 1.0f) {
                        yz3Var.f35647M = null;
                    }
                    yz3Var.m13274B();
                }
                break;
        }
        return ju4Var;
    }
}
