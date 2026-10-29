package p000;

import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class l62 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f23817a;

    static {
        byte[] bArr = new byte[0];
        f23817a = bArr;
        ByteBuffer.wrap(bArr);
        ua0 ua0Var = new ua0();
        ua0Var.f31750j = Integer.MAX_VALUE;
        ua0Var.f31744d = bArr;
        int i = 0 + 0;
        ua0Var.f31745e = i;
        ua0Var.f31746f = i;
        ua0Var.f31747g = 0;
        ua0Var.f31748h = 0;
        VarHandle.storeStoreFence();
        try {
            ua0Var.mo11317e(0);
        } catch (i72 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m7835a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: b */
    public static int m7836b(int i, int i2, int i3, byte[] bArr) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
