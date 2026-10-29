package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ep4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18356a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ dp4 f18357b;

    public /* synthetic */ ep4(byte b) {
        this.f18356a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f18356a;
        dp4 dp4Var = this.f18357b;
        switch (b) {
            case 0:
                fp4 fp4Var = new fp4((byte) 1);
                fp4Var.f19215b = dp4Var;
                VarHandle.storeStoreFence();
                return fp4Var;
            default:
                fp4 fp4Var2 = new fp4((byte) 0);
                fp4Var2.f19215b = dp4Var;
                VarHandle.storeStoreFence();
                return fp4Var2;
        }
    }
}
