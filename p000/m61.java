package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m61 extends w64 {

    /* JADX INFO: renamed from: u */
    public f61 f24682u;

    /* JADX INFO: renamed from: v */
    public u50 f24683v;

    /* JADX INFO: renamed from: w */
    public u50 f24684w;

    /* JADX INFO: renamed from: x */
    public Integer f24685x;

    /* JADX INFO: renamed from: l0 */
    public static m61 m8200l0(e61 e61Var, u50 u50Var, Integer num) throws GeneralSecurityException {
        u50 u50VarM7410a;
        byte[] bArr = u50Var.f31654a;
        f61 f61VarM5592b = f61.m5592b(e61Var);
        e61 e61Var2 = f61VarM5592b.f18783a;
        e61 e61Var3 = e61.f17839e;
        if (e61Var != e61Var3 && num == null) {
            xy4.m12793v("For given Variant ", e61Var, " the value of idRequirement must be non-null");
            return null;
        }
        if (e61Var == e61Var3 && num != null) {
            xy4.m12788q("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (bArr.length != 32) {
            throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + bArr.length);
        }
        if (e61Var2 == e61Var3) {
            u50VarM7410a = k63.f22941a;
        } else if (e61Var2 == e61.f17837c || e61Var2 == e61.f17838d) {
            u50VarM7410a = k63.m7410a(num.intValue());
        } else {
            if (e61Var2 != e61.f17836b) {
                wb1.m12196p(e61Var2, "Unknown Variant: ");
                return null;
            }
            u50VarM7410a = k63.m7411b(num.intValue());
        }
        m61 m61Var = new m61();
        m61Var.f24682u = f61VarM5592b;
        m61Var.f24683v = u50Var;
        m61Var.f24684w = u50VarM7410a;
        m61Var.f24685x = num;
        VarHandle.storeStoreFence();
        return m61Var;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: A */
    public final Integer mo4966A() {
        return this.f24685x;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: B */
    public final t73 mo3664B() {
        return this.f24682u;
    }

    @Override // p000.w64
    /* JADX INFO: renamed from: k0 */
    public final u50 mo6153k0() {
        return this.f24684w;
    }
}
