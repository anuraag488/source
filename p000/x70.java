package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class x70 {
    static {
        m12516a(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    }

    /* JADX INFO: renamed from: a */
    public static void m12516a(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            C1077qn.m9987m("invalid input length");
        } else {
            IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            intBufferAsIntBuffer.get(new int[intBufferAsIntBuffer.remaining()]);
        }
    }
}
