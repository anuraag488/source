package p000;

import androidx.work.impl.WorkDatabase_Impl;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a25 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f69a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ WorkDatabase_Impl f70b;

    public /* synthetic */ a25(byte b) {
        this.f69a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f69a;
        WorkDatabase_Impl workDatabase_Impl = this.f70b;
        switch (b) {
            case 0:
                u25 u25Var = new u25();
                u25Var.f31629a = workDatabase_Impl;
                u25Var.f31630b = new qy0((byte) 4);
                VarHandle.storeStoreFence();
                return u25Var;
            case 1:
                ry0 ry0Var = new ry0();
                ry0Var.f29725a = workDatabase_Impl;
                ry0Var.f29726b = new qy0((byte) 0);
                VarHandle.storeStoreFence();
                return ry0Var;
            case 2:
                w25 w25Var = new w25();
                w25Var.f33049a = workDatabase_Impl;
                w25Var.f33050b = new qy0((byte) 5);
                VarHandle.storeStoreFence();
                return w25Var;
            case 3:
                kg4 kg4Var = new kg4();
                kg4Var.f23111a = workDatabase_Impl;
                kg4Var.f23112b = new qy0((byte) 2);
                VarHandle.storeStoreFence();
                return kg4Var;
            case 4:
                l25 l25Var = new l25();
                l25Var.f23750a = workDatabase_Impl;
                l25Var.f23751b = new qy0((byte) 3);
                VarHandle.storeStoreFence();
                return l25Var;
            case 5:
                m25 m25Var = new m25();
                m25Var.f24599a = workDatabase_Impl;
                VarHandle.storeStoreFence();
                return m25Var;
            default:
                td3 td3Var = new td3();
                td3Var.f31089a = workDatabase_Impl;
                td3Var.f31090b = new qy0((byte) 1);
                VarHandle.storeStoreFence();
                return td3Var;
        }
    }
}
