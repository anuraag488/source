package p000;

import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uz2 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32266a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f32267b;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f32266a;
        Map map = this.f32267b;
        switch (b) {
            case 0:
                C1032pf c1032pf = new C1032pf((byte) 12);
                c1032pf.f27570b = map;
                VarHandle.storeStoreFence();
                return c1032pf;
            default:
                mw3 mw3Var = (mw3) map.remove(obj);
                if (mw3Var != null) {
                    mw3Var.mo3937a();
                }
                return ju4.f22634a;
        }
    }
}
