package p000;

import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ij2 extends AbstractC0601e7 {

    /* JADX INFO: renamed from: u */
    public jj2 f21494u;

    /* JADX INFO: renamed from: v */
    public u50 f21495v;

    /* JADX INFO: renamed from: w */
    public Integer f21496w;

    /* JADX INFO: renamed from: l0 */
    public static ij2 m6813l0(jj2 jj2Var, Integer num) throws GeneralSecurityException {
        u50 u50VarM11249b;
        C0973o7 c0973o7 = jj2Var.f22331b;
        if (c0973o7 == C0973o7.f26397w) {
            if (num == null) {
                xy4.m12788q("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            u50VarM11249b = u50.m11249b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (c0973o7 != C0973o7.f26398x) {
                xd2.m12666m(c0973o7, "Unknown Variant: ");
                return null;
            }
            if (num != null) {
                xy4.m12788q("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            u50VarM11249b = u50.m11249b(new byte[0]);
        }
        ij2 ij2Var = new ij2();
        ij2Var.f21494u = jj2Var;
        ij2Var.f21495v = u50VarM11249b;
        ij2Var.f21496w = num;
        VarHandle.storeStoreFence();
        return ij2Var;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: A */
    public final Integer mo4966A() {
        return this.f21496w;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: B */
    public final t73 mo3664B() {
        return this.f21494u;
    }

    @Override // p000.AbstractC0601e7
    /* JADX INFO: renamed from: k0 */
    public final u50 mo4940k0() {
        return this.f21495v;
    }
}
