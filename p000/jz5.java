package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jz5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22778a = 1;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ i16 f22779b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ j16 f22780c;

    public /* synthetic */ jz5(i16 i16Var, j16 j16Var) {
        this.f22779b = i16Var;
        this.f22780c = j16Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22778a) {
            case 0:
                i16 i16Var = this.f22779b;
                try {
                    this.f22780c.mo3680f();
                } catch (Throwable th) {
                    i16Var.getClass();
                    i16Var.m6557b(new gv5("Exception received from UploadDataProvider", th));
                    return;
                }
                break;
            default:
                i16 i16Var2 = this.f22779b;
                try {
                    this.f22780c.mo3680f();
                } catch (Throwable th2) {
                    gy5 gy5Var = new gy5((byte) 3);
                    gy5Var.f20201b = i16Var2;
                    VarHandle.storeStoreFence();
                    i16Var2.m6558c(gy5Var, "enterUserErrorState");
                    i16Var2.m6557b(new gv5("Exception received from UrlRequest.Callback", th2));
                }
                break;
        }
    }

    public /* synthetic */ jz5() {
    }
}
