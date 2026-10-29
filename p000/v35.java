package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v35 extends AbstractC0601e7 {

    /* JADX INFO: renamed from: u */
    public z35 f32361u;

    /* JADX INFO: renamed from: v */
    public wd3 f32362v;

    /* JADX INFO: renamed from: w */
    public u50 f32363w;

    /* JADX INFO: renamed from: x */
    public Integer f32364x;

    /* JADX INFO: renamed from: l0 */
    public static v35 m11717l0(z35 z35Var, wd3 wd3Var, Integer num) throws GeneralSecurityException {
        u50 u50VarM7411b;
        u50 u50Var = (u50) wd3Var.f33259b;
        C0641f8 c0641f8 = z35Var.f35742a;
        C0641f8 c0641f9 = C0641f8.f18825z;
        if (c0641f8 != c0641f9 && num == null) {
            xy4.m12793v("For given Variant ", c0641f8, " the value of idRequirement must be non-null");
            return null;
        }
        if (c0641f8 == c0641f9 && num != null) {
            xy4.m12788q("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (u50Var.f31654a.length != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + u50Var.f31654a.length);
        }
        if (c0641f8 == c0641f9) {
            u50VarM7411b = k63.f22941a;
        } else {
            if (c0641f8 != C0641f8.f18824y) {
                wb1.m12196p(c0641f8, "Unknown Variant: ");
                return null;
            }
            u50VarM7411b = k63.m7411b(num.intValue());
        }
        v35 v35Var = new v35();
        v35Var.f32361u = z35Var;
        v35Var.f32362v = wd3Var;
        v35Var.f32363w = u50VarM7411b;
        v35Var.f32364x = num;
        VarHandle.storeStoreFence();
        return v35Var;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: A */
    public final Integer mo4966A() {
        return this.f32364x;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: B */
    public final t73 mo3664B() {
        return this.f32361u;
    }

    @Override // p000.AbstractC0601e7
    /* JADX INFO: renamed from: k0 */
    public final u50 mo4940k0() {
        return this.f32363w;
    }
}
