package p000;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface j40 extends f74, WritableByteChannel {
    /* JADX INFO: renamed from: F */
    j40 mo6998F(String str);

    /* JADX INFO: renamed from: f */
    j40 mo6999f(long j);

    @Override // p000.f74, java.io.Flushable
    void flush();

    j40 writeByte(int i);
}
