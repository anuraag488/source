package p000;

import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class kr5 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f23354a;

    static {
        byte[] bArr = new byte[0];
        f23354a = bArr;
        ByteBuffer.wrap(bArr);
        cq6 cq6Var = new cq6();
        cq6Var.f16384i = Integer.MAX_VALUE;
        cq6Var.f16379d = bArr;
        cq6Var.f16380e = 0;
        cq6Var.f16381f = 0;
        cq6Var.f16382g = 0;
        VarHandle.storeStoreFence();
        try {
            cq6Var.mo4120K(0);
        } catch (ss5 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m7589a(int i, int i2, int i3, byte[] bArr) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
