package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ef6 {
    protected int zza;

    /* JADX INFO: renamed from: a */
    public final byte[] m5118a() {
        try {
            zh6 zh6Var = (zh6) this;
            int iM13571i = zh6Var.m13571i();
            byte[] bArr = new byte[iM13571i];
            ng6 ng6Var = new ng6(iM13571i, bArr);
            zh6Var.m13565c(ng6Var);
            if (iM13571i - ng6Var.f25786d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            xy4.m12785n(c75.m3881m(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo5119b(gk6 gk6Var);
}
