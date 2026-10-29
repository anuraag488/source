package p000;

import java.lang.invoke.VarHandle;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: t7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1172t7 extends t73 {

    /* JADX INFO: renamed from: a */
    public int f30972a;

    /* JADX INFO: renamed from: b */
    public static C1172t7 m10985b(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
        }
        C1172t7 c1172t7 = new C1172t7();
        c1172t7.f30972a = i;
        VarHandle.storeStoreFence();
        return c1172t7;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1172t7) && ((C1172t7) obj).f30972a == this.f30972a;
    }

    public final int hashCode() {
        return Objects.hash(C1172t7.class, Integer.valueOf(this.f30972a));
    }

    public final String toString() {
        return c75.m3880l(new StringBuilder("AesCmac PRF Parameters ("), this.f30972a, "-byte key)");
    }
}
