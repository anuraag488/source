package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class u36 {
    protected transient int zza;

    /* JADX INFO: renamed from: a */
    public abstract void mo10536a(n83 n83Var);

    /* JADX INFO: renamed from: b */
    public final byte[] m11237b() {
        try {
            int iMo10538d = mo10538d();
            byte[] bArr = new byte[iMo10538d];
            n83 n83Var = new n83(bArr, iMo10538d, (byte) 3);
            mo10536a(n83Var);
            int i = n83Var.f25532b;
            int i2 = n83Var.f25533c;
            if (i - i2 > 0) {
                C1077qn.m9989o("Did not write as much data as expected.");
            } else if (i - i2 < 0) {
                C1077qn.m9989o("Wrote more data than expected.");
            }
            return bArr;
        } catch (IOException e) {
            xy4.m12785n(zi4.m13621u("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo10537c(na6 na6Var);

    /* JADX INFO: renamed from: d */
    public abstract int mo10538d();
}
