package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class k63 {

    /* JADX INFO: renamed from: a */
    public static final u50 f22941a = u50.m11249b(new byte[0]);

    /* JADX INFO: renamed from: a */
    public static final u50 m7410a(int i) {
        return u50.m11249b(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    /* JADX INFO: renamed from: b */
    public static final u50 m7411b(int i) {
        return u50.m11249b(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
