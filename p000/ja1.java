package p000;

import essentials.app.EsActivity;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22130a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xz4 f22131b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ wz4 f22132c;

    public /* synthetic */ ja1(byte b) {
        this.f22130a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        switch (this.f22130a) {
            case 0:
                wz4 wz4Var = this.f22132c;
                xz4 xz4Var = this.f22131b;
                int i = EsActivity.f18447A;
                a70 a70Var = wz4Var.f33882c;
                if (a70Var != null) {
                    if (!a70Var.mo112b()) {
                        a70Var = null;
                    }
                    if (a70Var != null) {
                        a70Var.resumeWith(obj);
                    }
                }
                xz4Var.f34750e.remove(wz4Var);
                return ju4.f22634a;
            default:
                xz4 xz4Var2 = this.f22131b;
                wz4 wz4Var2 = this.f22132c;
                xz4Var2.f34750e.add(0, wz4Var2);
                C0562d4 c0562d4 = new C0562d4((byte) 6);
                c0562d4.f16768b = xz4Var2;
                c0562d4.f16769c = wz4Var2;
                VarHandle.storeStoreFence();
                return c0562d4;
        }
    }
}
