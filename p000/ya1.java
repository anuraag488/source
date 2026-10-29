package p000;

import android.content.Context;
import android.os.Bundle;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ya1 implements ai3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35068a;

    /* JADX INFO: renamed from: b */
    public v42 f35069b;

    public /* synthetic */ ya1(byte b) {
        this.f35068a = b;
    }

    @Override // p000.ai3
    public final Object get() {
        switch (this.f35068a) {
            case 0:
                bi3 bi3Var = (bi3) this.f35069b.f32392a;
                xa1 xa1Var = new xa1();
                xa1Var.f34096a = bi3Var;
                VarHandle.storeStoreFence();
                return xa1Var;
            case 1:
                hg1 hg1Var = (hg1) this.f35069b.f32392a;
                e34 e34Var = e34.f17665a;
                return e34.m4915a(hg1Var);
            case 2:
                return wv1.m12423m(new t31(C1035pi.f27626x), null, new eh1((Context) this.f35069b.f32392a, (byte) 1), 6);
            case 3:
                Context context = (Context) this.f35069b.f32392a;
                vm2 vm2Var = new vm2();
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                vm2Var.f32732a = bundle;
                VarHandle.storeStoreFence();
                return vm2Var;
            default:
                Context context2 = (Context) this.f35069b.f32392a;
                m34 m34Var = new m34();
                m34Var.f24620a = context2;
                VarHandle.storeStoreFence();
                return m34Var;
        }
    }
}
