package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b34 implements ai3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15060a;

    /* JADX INFO: renamed from: b */
    public ai3 f15061b;

    /* JADX INFO: renamed from: c */
    public ai3 f15062c;

    public /* synthetic */ b34(byte b) {
        this.f15060a = b;
    }

    @Override // p000.ai3
    public final Object get() {
        switch (this.f15060a) {
            case 0:
                ro0 ro0Var = (ro0) this.f15061b.get();
                lt0 lt0Var = (lt0) this.f15062c.get();
                a34 a34Var = new a34();
                a34Var.f79a = ro0Var;
                a34Var.f80b = lt0Var;
                a34Var.f81c = new AtomicReference();
                si1 data = lt0Var.getData();
                y24 y24Var = new y24(3, null, (byte) 0);
                yi1 yi1Var = new yi1((byte) 1);
                yi1Var.f35236b = data;
                yi1Var.f35237c = y24Var;
                VarHandle.storeStoreFence();
                aj1 aj1Var = new aj1((byte) 6);
                aj1Var.f14534b = yi1Var;
                aj1Var.f14535c = a34Var;
                VarHandle.storeStoreFence();
                a34Var.f82d = aj1Var;
                lb5.m7910S(zp0.m13670b(ro0Var), null, null, new C0982og(a34Var, (wm0) null, (byte) 23), 3);
                VarHandle.storeStoreFence();
                return a34Var;
            default:
                i44 i44Var = (i44) this.f15061b.get();
                i44 i44Var2 = (i44) this.f15062c.get();
                s34 s34Var = new s34();
                s34Var.f29856a = i44Var;
                s34Var.f29857b = i44Var2;
                VarHandle.storeStoreFence();
                return s34Var;
        }
    }
}
