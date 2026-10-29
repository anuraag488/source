package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lj2 extends AbstractC0601e7 {

    /* JADX INFO: renamed from: u */
    public mj2 f24067u;

    /* JADX INFO: renamed from: v */
    public u50 f24068v;

    /* JADX INFO: renamed from: w */
    public Integer f24069w;

    /* JADX INFO: renamed from: l0 */
    public static lj2 m7991l0(mj2 mj2Var, Integer num) throws GeneralSecurityException {
        u50 u50VarM7411b;
        C0973o7 c0973o7 = mj2Var.f24967a;
        if (c0973o7 == C0973o7.f26400z) {
            if (num != null) {
                xy4.m12788q("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            u50VarM7411b = k63.f22941a;
        } else {
            if (c0973o7 != C0973o7.f26399y) {
                xd2.m12666m(c0973o7, "Unknown Variant: ");
                return null;
            }
            if (num == null) {
                xy4.m12788q("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            u50VarM7411b = k63.m7411b(num.intValue());
        }
        lj2 lj2Var = new lj2();
        lj2Var.f24067u = mj2Var;
        lj2Var.f24068v = u50VarM7411b;
        lj2Var.f24069w = num;
        VarHandle.storeStoreFence();
        return lj2Var;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: A */
    public final Integer mo4966A() {
        return this.f24069w;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: B */
    public final t73 mo3664B() {
        return this.f24067u;
    }

    @Override // p000.AbstractC0601e7
    /* JADX INFO: renamed from: k0 */
    public final u50 mo4940k0() {
        return this.f24068v;
    }
}
