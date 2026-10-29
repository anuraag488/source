package p000;

import java.io.OutputStream;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u06 extends zx5 {

    /* JADX INFO: renamed from: i */
    public final HttpURLConnection f31582i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f31583j;

    /* JADX INFO: renamed from: k */
    public WritableByteChannel f31584k;

    /* JADX INFO: renamed from: l */
    public OutputStream f31585l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ i16 f31586m;

    public u06(i16 i16Var, Executor executor, h16 h16Var, HttpURLConnection httpURLConnection, cr5 cr5Var) {
        this.f31586m = i16Var;
        this.f36449a = new AtomicInteger(3);
        xt2 xt2Var = new xt2((byte) 1);
        xt2Var.f34616b = executor;
        xt2Var.f34617c = this;
        VarHandle.storeStoreFence();
        this.f36450b = xt2Var;
        this.f36451c = h16Var;
        this.f36452d = new cr5((Object) cr5Var, (byte) 3);
        this.f31583j = new AtomicBoolean(false);
        this.f31582i = httpURLConnection;
    }

    @Override // p000.zx5
    /* JADX INFO: renamed from: a */
    public final void mo11198a(Exception exc) {
        i16 i16Var = this.f31586m;
        i16Var.getClass();
        i16Var.m6557b(new gv5("Exception received from UploadDataProvider", exc));
    }
}
