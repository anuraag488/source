package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f45 extends AbstractC0601e7 {

    /* JADX INFO: renamed from: u */
    public i45 f18747u;

    /* JADX INFO: renamed from: v */
    public wd3 f18748v;

    /* JADX INFO: renamed from: w */
    public u50 f18749w;

    /* JADX INFO: renamed from: x */
    public Integer f18750x;

    /* JADX INFO: renamed from: l0 */
    public static f45 m5506l0(C0973o7 c0973o7, wd3 wd3Var, Integer num) throws GeneralSecurityException {
        u50 u50VarM7411b;
        u50 u50Var = (u50) wd3Var.f33259b;
        C0973o7 c0973o8 = C0973o7.f26376C;
        if (c0973o7 != c0973o8 && num == null) {
            xy4.m12793v("For given Variant ", c0973o7, " the value of idRequirement must be non-null");
            return null;
        }
        if (c0973o7 == c0973o8 && num != null) {
            xy4.m12788q("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (u50Var.f31654a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + u50Var.f31654a.length);
        }
        i45 i45VarM6664b = i45.m6664b(c0973o7);
        C0973o7 c0973o9 = i45VarM6664b.f21127a;
        if (c0973o9 == c0973o8) {
            u50VarM7411b = k63.f22941a;
        } else if (c0973o9 == C0973o7.f26375B) {
            u50VarM7411b = k63.m7410a(num.intValue());
        } else {
            if (c0973o9 != C0973o7.f26374A) {
                wb1.m12196p(c0973o9, "Unknown Variant: ");
                return null;
            }
            u50VarM7411b = k63.m7411b(num.intValue());
        }
        f45 f45Var = new f45();
        f45Var.f18747u = i45VarM6664b;
        f45Var.f18748v = wd3Var;
        f45Var.f18749w = u50VarM7411b;
        f45Var.f18750x = num;
        VarHandle.storeStoreFence();
        return f45Var;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: A */
    public final Integer mo4966A() {
        return this.f18750x;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: B */
    public final t73 mo3664B() {
        return this.f18747u;
    }

    @Override // p000.AbstractC0601e7
    /* JADX INFO: renamed from: k0 */
    public final u50 mo4940k0() {
        return this.f18749w;
    }
}
