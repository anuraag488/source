package p000;

import ads_mobile_sdk.r91;
import java.lang.invoke.VarHandle;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qf5 implements n60 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ r91 f28441a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f28442b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f28443c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f28444d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ byte[] f28445e;

    @Override // p000.n60
    /* JADX INFO: renamed from: f */
    public final Object mo4036f(m60 m60Var) {
        r91 r91Var = this.f28441a;
        String str = this.f28442b;
        boolean z = this.f28443c;
        String str2 = this.f28444d;
        byte[] bArr = this.f28445e;
        ExecutorService executorService = r91Var.f10604a;
        RunnableC0852ky runnableC0852ky = new RunnableC0852ky((byte) 1);
        runnableC0852ky.f23606d = r91Var;
        runnableC0852ky.f23604b = str;
        runnableC0852ky.f23607e = m60Var;
        runnableC0852ky.f23605c = z;
        runnableC0852ky.f23608f = str2;
        runnableC0852ky.f23609g = bArr;
        VarHandle.storeStoreFence();
        executorService.execute(runnableC0852ky);
        return "";
    }
}
